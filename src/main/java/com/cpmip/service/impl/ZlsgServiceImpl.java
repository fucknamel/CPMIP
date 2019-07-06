package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ZlsgMapper;
import com.cpmip.pojo.Zlsg;
import com.cpmip.service.IZlsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
