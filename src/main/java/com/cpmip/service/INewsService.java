package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.News;

public interface INewsService {

    public ServerResponse add(News item);

    public ServerResponse deleteById(Integer id);

    public ServerResponse changeById(News item);

    public ServerResponse getList(int pageNum, int pageSize);
}
