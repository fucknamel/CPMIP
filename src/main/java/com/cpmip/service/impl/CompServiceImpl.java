package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ComplaintsMapper;
import com.cpmip.pojo.Complaints;
import com.cpmip.service.ICompService;
import com.cpmip.util.DateTimeUtil;
import com.cpmip.vo.CompListVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iCompService")
public class CompServiceImpl implements ICompService {

    @Autowired
    private ComplaintsMapper complaintsMapper;

    public ServerResponse add(Complaints item){
        int resultCount = complaintsMapper.insert(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    public ServerResponse deleteById(Integer id){
        int resultCount = complaintsMapper.deleteByPrimaryKey(id);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    public ServerResponse changeById(Complaints item){
        int resultCount = complaintsMapper.updateByPrimaryKeySelective(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    public ServerResponse getList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Complaints> complaintsList = complaintsMapper.selectList();

        List<CompListVo> compListVoList = Lists.newArrayList();
        for (Complaints complaints : complaintsList){
            CompListVo compListVo = assembleCompListVo(complaints);
            compListVoList.add(compListVo);
        }
        PageInfo pageResult = new PageInfo(complaintsList);
        pageResult.setList(compListVoList);

        return ServerResponse.createBySuccess(pageResult);
    }

    private CompListVo assembleCompListVo(Complaints item){
        CompListVo compListVo = new CompListVo();
        compListVo.setId(item.getId());
        compListVo.setPosition(item.getPosition());
        compListVo.setComplaintsTime(DateTimeUtil.dateToStr(item.getComplaintsTime()));
        compListVo.setDeal(item.getDeal());
        compListVo.setExamine(item.getDown());
        compListVo.setDown(item.getDown());

        return compListVo;
    }
}
