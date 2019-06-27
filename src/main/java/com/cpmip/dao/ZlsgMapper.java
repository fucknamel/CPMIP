package com.cpmip.dao;

import com.cpmip.pojo.Zlsg;

public interface ZlsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zlsg record);

    int insertSelective(Zlsg record);

    Zlsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zlsg record);

    int updateByPrimaryKey(Zlsg record);
}