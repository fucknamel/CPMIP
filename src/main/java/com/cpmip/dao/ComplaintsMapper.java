package com.cpmip.dao;

import com.cpmip.pojo.Complaints;

import java.util.List;

public interface ComplaintsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Complaints record);

    int insertSelective(Complaints record);

    Complaints selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Complaints record);

    int updateByPrimaryKey(Complaints record);

    List<Complaints> selectList();
}