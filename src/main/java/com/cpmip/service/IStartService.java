package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Start;

public interface IStartService {

    public ServerResponse add(Start item);

    public ServerResponse deleteById(Integer id);
}
