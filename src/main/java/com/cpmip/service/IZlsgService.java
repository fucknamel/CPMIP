package com.cpmip.service;

import  com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Zlsg;

public interface IZlsgService {

    public ServerResponse add(Zlsg item);

    public ServerResponse deleteById(Integer id);

    public ServerResponse changeById(Zlsg item);

}
