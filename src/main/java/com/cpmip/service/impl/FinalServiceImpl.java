package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.FinalMapper;
import com.cpmip.pojo.Final;
import com.cpmip.service.IFinalService;
import com.cpmip.util.DateTimeUtil;
import com.cpmip.vo.FinalListVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iFinalService")
public class FinalServiceImpl implements IFinalService {

    @Autowired
    private FinalMapper finalMapper;

    public ServerResponse add(Final item){
        int resultCount = finalMapper.insert(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    public ServerResponse deleteById(Integer id){
        int resultCount = finalMapper.deleteByPrimaryKey(id);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    public ServerResponse changeById(Final item){
        int resultCount = finalMapper.updateByPrimaryKeySelective(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    public ServerResponse getList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Final> finalList = finalMapper.selectList();

        List<FinalListVo> finalListVoList = Lists.newArrayList();
        for (Final finals : finalList){
            FinalListVo finalListVo = assembleFinalListVo(finals);
            finalListVoList.add(finalListVo);
        }
        PageInfo pageResult = new PageInfo(finalList);
        pageResult.setList(finalListVoList);

        return ServerResponse.createBySuccess(pageResult);
    }

    private FinalListVo assembleFinalListVo(Final item){
        FinalListVo finalListVo = new FinalListVo();
        finalListVo.setId(item.getId());
        finalListVo.setConstruname(item.getConstruname());
        finalListVo.setPosition(item.getPosition());
        finalListVo.setStartTime(DateTimeUtil.dateToStr(item.getStartTime()));
        finalListVo.setFinalTime(DateTimeUtil.dateToStr(item.getFinalTime()));

        return finalListVo;
    }
}
