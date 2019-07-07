package com.cpmip.service.impl;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.dao.AqsgMapper;
import com.cpmip.pojo.Aqsg;
import com.cpmip.service.IAqsgService;
import com.cpmip.util.DateTimeUtil;
import com.cpmip.vo.AqsgListVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("iAqsgService")
public class AqsgServiceImpl implements IAqsgService {

    @Autowired
    private AqsgMapper aqsgMapper;

    public ServerResponse add(Aqsg item){
        int resultCount = aqsgMapper.insert(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    public ServerResponse deleteById(Integer id){
        int resultCount = aqsgMapper.deleteByPrimaryKey(id);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    public ServerResponse changeById(Aqsg item){
        int resultCount = aqsgMapper.updateByPrimaryKeySelective(item);
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
            if (Const.AqsgOrderBy.REPORT_TIME_ASC_DESC.contains(orderBy)){
                String[] orderByArray = orderBy.split("_");
                PageHelper.orderBy(orderByArray[0] + "_" + orderByArray[1] + " " + orderByArray[2]);
            }
        }
        List<Aqsg> aqsgList = aqsgMapper.selectListByTime(beginDate, endDate);

        List<AqsgListVo> aqsgListVoList = Lists.newArrayList();
        for (Aqsg aqsg : aqsgList){
            AqsgListVo aqsgListVo = assembleAqsgListVo(aqsg);
            aqsgListVoList.add(aqsgListVo);
        }
        PageInfo pageResult = new PageInfo(aqsgList);
        pageResult.setList(aqsgListVoList);

        return ServerResponse.createBySuccess(pageResult);
    }

    private AqsgListVo assembleAqsgListVo(Aqsg item){
        AqsgListVo aqsgListVo = new AqsgListVo();
        aqsgListVo.setId(item.getId());
        aqsgListVo.setConstruname(item.getConstruname());
        aqsgListVo.setConstruction(item.getConstruction());
        aqsgListVo.setPosition(item.getPosition());
        aqsgListVo.setBuild(item.getBuild());
        aqsgListVo.setReportTime(DateTimeUtil.dateToStr(item.getReportTime()));

        return aqsgListVo;
    }
}
