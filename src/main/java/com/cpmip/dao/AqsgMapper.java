package com.cpmip.dao;

import com.cpmip.pojo.Aqsg;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AqsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Aqsg record);

    int insertSelective(Aqsg record);

    Aqsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Aqsg record);

    int updateByPrimaryKey(Aqsg record);

    List<Aqsg> selectListByTime(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
}