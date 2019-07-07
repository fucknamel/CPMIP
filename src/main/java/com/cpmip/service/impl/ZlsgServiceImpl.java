package com.cpmip.service.impl;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ZlsgMapper;
import com.cpmip.pojo.Zlsg;
import com.cpmip.service.IZlsgService;
import com.cpmip.util.DateTimeUtil;
import com.cpmip.vo.ZlsgListVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("iZlsgService")
public class ZlsgServiceImpl implements IZlsgService {

    @Autowired
    private ZlsgMapper zlsgMapper;

    public ServerResponse add(Zlsg item){
        int resultCount = zlsgMapper.insert(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    public ServerResponse deleteById(Integer id){
        int resultCount = zlsgMapper.deleteByPrimaryKey(id);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    public ServerResponse changeById(Zlsg item){
        int resultCount = zlsgMapper.updateByPrimaryKeySelective(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    public ServerResponse getListByTime(String beginTime, String endTime, int pageNum, int pageSize, String orderBy){
        Date beginDate = null, endDate = null;
        if (StringUtils.isNotBlank(beginTime) && StringUtils.isNotBlank(endTime)){
            beginDate = DateTimeUtil.strToDate(beginTime);
            endDate = DateTimeUtil.strToDate(endTime);
            if (endDate.before(beginDate)){
                return ServerResponse.createByErrorMessage("时间范围错误");
            }
        }

        PageHelper.startPage(pageNum, pageSize);
        // sort
        if (StringUtils.isNotBlank(orderBy)){
            if (Const.ZlsgOrderBy.REPORT_TIME_ASC_DESC.contains(orderBy)){
                String[] orderByArray = orderBy.split("_");
                PageHelper.orderBy(orderByArray[0] + "_" + orderByArray[1] + " " + orderByArray[2]);
            }
        }
        List<Zlsg> zlsgList = zlsgMapper.selectListByTime(beginDate, endDate);

        List<ZlsgListVo> zlsgListVoList = Lists.newArrayList();
        for (Zlsg zlsg : zlsgList){
            ZlsgListVo zlsgListVo = assembleZlsgListVo(zlsg);
            zlsgListVoList.add(zlsgListVo);
        }
        PageInfo pageResult = new PageInfo(zlsgList);
        pageResult.setList(zlsgListVoList);

        return ServerResponse.createBySuccess(pageResult);
    }

    private ZlsgListVo assembleZlsgListVo(Zlsg item){
        ZlsgListVo zlsgListVo = new ZlsgListVo();
        zlsgListVo.setId(item.getId());
        zlsgListVo.setConstruname(item.getConstruname());
        zlsgListVo.setPosition(item.getPosition());
        zlsgListVo.setBuild(item.getBuild());
        zlsgListVo.setConstruction(item.getConstruction());
        zlsgListVo.setReportTime(DateTimeUtil.dateToStr(item.getReportTime()));

        return zlsgListVo;
    }
}
