package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Final;

public interface IFinalService {

    public ServerResponse add(Final item);

    public ServerResponse deleteById(Integer id);

    public ServerResponse changeById(Final item);

    public ServerResponse getList(int pageNum, int pageSize);
}
