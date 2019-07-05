package com.cpmip.service.impl;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.dao.GovUserMapper;
import com.cpmip.pojo.GovUser;
import com.cpmip.service.IGovUserService;
import com.cpmip.util.MD5Util;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("iGovUserService")
public class GovUserServiceImpl implements IGovUserService{
    @Autowired
    private GovUserMapper govUserMapper;

    public ServerResponse login(String jobId, String password){
        int resultCount = govUserMapper.checkJObId(jobId);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("jobId不存在");
        }

        String md5Password = MD5Util.MD5EncodeUtf8(password);
        GovUser user = govUserMapper.selectLogin(jobId, md5Password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", user);
    }

    public ServerResponse register(GovUser user){
        ServerResponse validResponse = this.checkValid(user.getName(), Const.JOBID);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }

        validResponse = this.checkValid(user.getPhone(), Const.GOVUSERPHONE);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }

        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));

        int resultCount = govUserMapper.insert(user);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    public ServerResponse<String> checkValid(String str, String type){
        if (StringUtils.isNotBlank(type)) {
            //开始校验
            if (Const.USERNAME.equals(type)) {
                int resultCount = govUserMapper.checkJObId(str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("jobId已存在");
                }
            }

            if (Const.ORGCODE.equals(type)) {
                int resultCount = govUserMapper.checkPhone(str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("手机号码已存在");
                }
            }

        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccessMessage("校验成功");
    }
}
