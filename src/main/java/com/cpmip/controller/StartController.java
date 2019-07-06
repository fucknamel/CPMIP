package com.cpmip.controller;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Start;
import com.cpmip.service.IStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/start/")
public class StartController {

    @Autowired
    private IStartService iStartService;

    @RequestMapping(value = "add.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse add(Start item, HttpSession session){
        if (session.getAttribute(Const.CURRENT_USER) != null) {
            return iStartService.add(item);
        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }

    @RequestMapping(value = "delete.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse deleteById(Integer id, HttpSession session){
        if (session.getAttribute(Const.CURRENT_USER) != null) {
            return iStartService.deleteById(id);
        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }
}
