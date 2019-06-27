package com.cpmip.dao;

import com.cpmip.pojo.Aqsg;

public interface AqsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Aqsg record);

    int insertSelective(Aqsg record);

    Aqsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Aqsg record);

    int updateByPrimaryKey(Aqsg record);
}