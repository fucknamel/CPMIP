package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.News;

public interface INewsService {

    public ServerResponse add(News item);

    public ServerResponse deleteById(Integer id);
}
