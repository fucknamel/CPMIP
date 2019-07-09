package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ComplaintsMapper;
import com.cpmip.pojo.Complaints;
import com.cpmip.service.ICompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
