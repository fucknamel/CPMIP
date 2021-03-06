package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Complaints;

public interface ICompService {

    public ServerResponse add(Complaints item);

    public ServerResponse deleteById(Integer id);

    public ServerResponse changeById(Complaints item);

    public ServerResponse getList(int pageNum, int pageSize);
}
