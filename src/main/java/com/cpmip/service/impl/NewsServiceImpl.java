package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.NewsMapper;
import com.cpmip.pojo.News;
import com.cpmip.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iNewsService")
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;

    public ServerResponse add(News item){
        int resultCount = newsMapper.insert(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    public ServerResponse deleteById(Integer id){
        int resultCount = newsMapper.deleteByPrimaryKey(id);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }
}
