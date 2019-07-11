package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.NewsMapper;
import com.cpmip.pojo.News;
import com.cpmip.service.INewsService;
import com.cpmip.util.DateTimeUtil;
import com.cpmip.vo.NewsListVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public ServerResponse changeById(News item){
        int resultCount = newsMapper.updateByPrimaryKeySelective(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    public ServerResponse getList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<News> newsList = newsMapper.selectList();

        List<NewsListVo> newsListVoList = Lists.newArrayList();
        for (News news : newsList){
            NewsListVo newsListVo = assembleNewsListVo(news);
            newsListVoList.add(newsListVo);
        }
        PageInfo pageResult = new PageInfo(newsList);
        pageResult.setList(newsListVoList);

        return ServerResponse.createBySuccess(pageResult);
    }

    private NewsListVo assembleNewsListVo(News news){
        NewsListVo newsListVo = new NewsListVo();
        newsListVo.setId(news.getId());
        newsListVo.setTitle(news.getTitle());
        newsListVo.setOperator(news.getOperator());
        newsListVo.setPublishTime(DateTimeUtil.dateToStr(news.getCreateTime()));

        return newsListVo;
    }
}
