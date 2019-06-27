package com.cpmip.dao;

import com.cpmip.pojo.GovUser;

public interface GovUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GovUser record);

    int insertSelective(GovUser record);

    GovUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GovUser record);

    int updateByPrimaryKey(GovUser record);
}