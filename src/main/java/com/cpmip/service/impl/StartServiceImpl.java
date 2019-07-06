package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.StartMapper;
import com.cpmip.pojo.Start;
import com.cpmip.service.IStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
