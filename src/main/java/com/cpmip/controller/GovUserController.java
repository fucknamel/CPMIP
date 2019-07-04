package com.cpmip.controller;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.GovUser;
import com.cpmip.service.IGovUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/gov_user/")
public class GovUserController {
    @Autowired
    private IGovUserService iGovUserService;

    @RequestMapping(value = "gov_login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<GovUser> login(String username, String password, HttpSession session){
        ServerResponse<GovUser> response = iGovUserService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }

        return response;
    }

    @RequestMapping(value = "gov_logout.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping(value = "gov_register.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(GovUser user) {
        return iGovUserService.register(user);
    }

    @RequestMapping(value = "check_valid.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String str, String type) {
        return iGovUserService.checkValid(str, type);
    }
}
