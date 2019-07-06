package com.cpmip.service.impl;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ComUserMapper;
import com.cpmip.pojo.ComUser;
import com.cpmip.service.IComUserService;
import com.cpmip.util.MD5Util;
import com.cpmip.vo.UserVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iComUserService")
public class ComUserServiceImpl implements IComUserService {

    @Autowired
    private ComUserMapper comUserMapper;

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
        return ServerResponse.createBySuccess("登录成功", assembleUserVo(user));
    }

    private UserVo assembleUserVo(ComUser user){
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setName(user.getName());
        userVo.setRole(user.getCompany());

        return userVo;
    }

    public ServerResponse register(ComUser user){
        ServerResponse validResponse = this.checkValid(user.getName(), Const.USERNAME);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }

        validResponse = this.checkValid(user.getOrgcode(), Const.ORGCODE);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }

        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));

        int resultCount = comUserMapper.insert(user);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    public ServerResponse<String> checkValid(String str, String type){
        if (StringUtils.isNotBlank(type)) {
            //开始校验
            if (Const.USERNAME.equals(type)){
                int resultCount = comUserMapper.checkUsername(str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("用户名已存在");
                }
            }
            if (Const.ORGCODE.equals(type)){
                int resultCount = comUserMapper.checkOrgcode(str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("组织机构代码已存在");
                }
            }
        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccessMessage("校验成功");
    }
}
