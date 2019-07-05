package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.AqsgMapper;
import com.cpmip.pojo.Aqsg;
import com.cpmip.service.IAqsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
