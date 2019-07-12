package com.cpmip.dao;

import com.cpmip.pojo.Final;

import java.util.List;

public interface FinalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Final record);

    int insertSelective(Final record);

    Final selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Final record);

    int updateByPrimaryKey(Final record);

    List<Final> selectList();
}