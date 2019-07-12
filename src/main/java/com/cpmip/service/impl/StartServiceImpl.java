package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.StartMapper;
import com.cpmip.pojo.Start;
import com.cpmip.service.IStartService;
import com.cpmip.util.DateTimeUtil;
import com.cpmip.vo.StartListVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iStartService")
public class StartServiceImpl implements IStartService {

    @Autowired
    private StartMapper startMapper;

    public ServerResponse add(Start item){
        int resultCount = startMapper.insert(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    public ServerResponse deleteById(Integer id){
        int resultCount = startMapper.deleteByPrimaryKey(id);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    public ServerResponse changeById(Start item){
        int resultCount = startMapper.updateByPrimaryKeySelective(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    public ServerResponse getList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Start> starts = startMapper.selectList();

        List<StartListVo> startListVoList = Lists.newArrayList();
        for (Start start : starts){
            StartListVo startListVo = assembleStartListVo(start);
            startListVoList.add(startListVo);
        }
        PageInfo pageResult = new PageInfo(starts);
        pageResult.setList(startListVoList);

        return ServerResponse.createBySuccess(pageResult);
    }

    private StartListVo assembleStartListVo(Start item){
        StartListVo startListVo = new StartListVo();
        startListVo.setId(item.getId());
        startListVo.setConstruname(item.getConstruname());
        startListVo.setPosition(item.getPosition());
        startListVo.setStartTime(DateTimeUtil.dateToStr(item.getCreateTime()));
        startListVo.setBuilder(item.getBuilder());
        startListVo.setConstruction(item.getConstruction());

        return startListVo;
    }
}
