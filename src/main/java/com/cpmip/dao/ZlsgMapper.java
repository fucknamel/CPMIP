package com.cpmip.dao;

import com.cpmip.pojo.Zlsg;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ZlsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zlsg record);

    int insertSelective(Zlsg record);

    Zlsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zlsg record);

    int updateByPrimaryKey(Zlsg record);

    List<Zlsg> selectListByTime(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
}