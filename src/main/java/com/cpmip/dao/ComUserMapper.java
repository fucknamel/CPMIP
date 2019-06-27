package com.cpmip.dao;

import com.cpmip.pojo.ComUser;
import org.apache.ibatis.annotations.Param;

public interface ComUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComUser record);

    int insertSelective(ComUser record);

    ComUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComUser record);

    int updateByPrimaryKey(ComUser record);

    int checkUsername(String username);

    ComUser selectLogin(@Param("username") String username, @Param("password") String password);
}