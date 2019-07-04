package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.GovUserMapper;
import com.cpmip.pojo.GovUser;
import com.cpmip.service.IGovUserService;
import com.cpmip.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iGovUserService")
public class GovUserServiceImpl implements IGovUserService {

    @Autowired
    private GovUserMapper govUserMapper;

    public ServerResponse login(String jobId, String password){
        int resultCount = govUserMapper.checkId(jobId);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        String md5Password = MD5Util.MD5EncodeUtf8(password);
        GovUser user = govUserMapper.selectLogin(jobId, md5Password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", user);
    }
}