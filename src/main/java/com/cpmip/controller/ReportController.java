package com.cpmip.controller;


import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Report;
import com.cpmip.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/report/")
public class ReportController {

    @Autowired
    private IReportService iReportService;

    @RequestMapping(value = "add.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse add(Report item, HttpSession session){
        if (session.getAttribute(Const.CURRENT_USER) != null) {
            return iReportService.add(item);
        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }

    @RequestMapping(value = "delete.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse deleteById(Integer id,HttpSession session){
        if(session.getAttribute(Const.CURRENT_USER) != null){
            return iReportService.deleteById(id);
        }
        return ServerResponse.createByErrorMessage("用户未登录");

    }

    @RequestMapping(value = " change.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse changeById(Report item, HttpSession session){
        if(session.getAttribute(Const.CURRENT_USER) != null){
            return iReportService.changeById(item);
        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }
}
