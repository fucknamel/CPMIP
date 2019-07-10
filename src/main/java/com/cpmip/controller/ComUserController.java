package com.cpmip.controller;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.ComUser;
import com.cpmip.service.IComUserService;
import com.cpmip.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/com_user/")
public class ComUserController {

    @Autowired
    private IComUserService iComUserService;

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse login(String username, String password, HttpSession session){
        ServerResponse<UserVo> response = iComUserService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, response.getData());
            session.setAttribute(Const.ROLE, response.getData().getRole());
        }

        return response;
    }

    @RequestMapping(value = "logout.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        session.removeAttribute(Const.ROLE);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(ComUser user) {
        return iComUserService.register(user);
    }

    @RequestMapping(value = "check_valid.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String str, String type) {
        return iComUserService.checkValid(str, type);
    }

    @RequestMapping(value = "get_user_info.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse getUserInfo(HttpSession session) {
        UserVo user = (UserVo) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorMessage("用户未登录，无法获取当前用户信息");
        } else if ((int)session.getAttribute(Const.ROLE) != 0 && (int)session.getAttribute(Const.ROLE) != 1) {
            return ServerResponse.createByErrorMessage("登陆用户ROLE错误");
        }
        return iComUserService.getUserInfo(user.getId());
    }
}
