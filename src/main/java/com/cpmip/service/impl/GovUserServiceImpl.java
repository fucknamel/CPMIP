package com.cpmip.service.impl;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.dao.GovUserMapper;
import com.cpmip.pojo.GovUser;
import com.cpmip.service.IGovUserService;
import com.cpmip.util.MD5Util;
import com.cpmip.vo.UserVo;
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
            return ServerResponse.createByErrorMessage("jobId不存在");
        }

        String md5Password = MD5Util.MD5EncodeUtf8(password);
        GovUser user = govUserMapper.selectLogin(jobId, md5Password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", assembleUserVo(user));
    }

    private UserVo assembleUserVo(GovUser user){
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setName(user.getName());
        userVo.setRole(user.getDept());

        return userVo;
    }

    public ServerResponse register(GovUser user){
        ServerResponse validResponse = this.checkValid(user.getJobId(), Const.JOBID);
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

    public ServerResponse<String> checkValid(String jobId, String type){
        if (StringUtils.isNotBlank(type)) {
            //开始校验
            if (Const.JOBID.equals(type)){
                int resultCount = govUserMapper.checkId(jobId);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("jobId已经存在");
                }
            }
        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccessMessage("校验成功");
    }

    public ServerResponse getUserInfo(Integer id){
         GovUser user = govUserMapper.selectByPrimaryKey(id);
         if (user == null){
             return ServerResponse.createByErrorMessage("无此用户，参数错误");
         }
         user.setPassword(StringUtils.EMPTY);

         return ServerResponse.createBySuccess(user);
    }
}
