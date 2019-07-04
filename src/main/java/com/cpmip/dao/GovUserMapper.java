package com.cpmip.dao;

import com.cpmip.pojo.GovUser;
import org.apache.ibatis.annotations.Param;

public interface GovUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GovUser record);

    int insertSelective(GovUser record);

    GovUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GovUser record);

    int updateByPrimaryKey(GovUser record);


    int checkPhone(String phone);

    int checkUsername(String username);

    GovUser selectLogin(@Param("username") String username, @Param("password") String password);

}