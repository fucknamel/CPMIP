package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ComUserMapper;
import com.cpmip.pojo.ComUser;
import com.cpmip.service.IComUserService;
import com.cpmip.util.MD5Util;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iComUserService")
public class ComUserServiceImpl implements IComUserService {

    @Autowired
    private ComUserMapper comUserMapper;

    @Override
    public ServerResponse login(String username, String password){
        int resultCount = comUserMapper.checkUsername(username);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        String md5Password = MD5Util.MD5EncodeUtf8(password);
        ComUser user = comUserMapper.selectLogin(username, md5Password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", user);
    }
}
