package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Aqsg;

public interface IAqsgService {

    public ServerResponse add(Aqsg item);

    public ServerResponse deleteById(Integer id);

    public ServerResponse changeById(Aqsg item);
}
