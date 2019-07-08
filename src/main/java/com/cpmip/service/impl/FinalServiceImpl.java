package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.FinalMapper;
import com.cpmip.pojo.Final;
import com.cpmip.service.IFinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
