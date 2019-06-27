package com.cpmip.controller;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.ComUser;
import com.cpmip.service.IComUserService;
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
    public ServerResponse<ComUser> login(String username, String password, HttpSession session){
        ServerResponse<ComUser> response = iComUserService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }

        return response;
    }
}
