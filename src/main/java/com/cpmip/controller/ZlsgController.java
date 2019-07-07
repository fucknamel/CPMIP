package com.cpmip.controller;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Zlsg;
import com.cpmip.service.IZlsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/zlsg/")
public class ZlsgController {

    @Autowired
    private IZlsgService iZlsgService;

    @RequestMapping(value = "add.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse add(Zlsg item, HttpSession session){
        if (session.getAttribute(Const.CURRENT_USER) != null) {
            return iZlsgService.add(item);
        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }

    @RequestMapping(value = "delete.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse deleteById(Integer id, HttpSession session){
        if (session.getAttribute(Const.CURRENT_USER) != null) {
            return iZlsgService.deleteById(id);
        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }

    @RequestMapping(value = "change.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse changeById(Zlsg item, HttpSession session){
        if (session.getAttribute(Const.CURRENT_USER) != null) {
            return iZlsgService.changeById(item);
        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }

    @RequestMapping(value = "get_time_list", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse getListByTime(@RequestParam(value = "beginTime", required = false) String beginTime,
                                        @RequestParam(value = "endTime", required = false) String endTime,
                                        @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                        @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                        @RequestParam(value = "orderBy", defaultValue = "") String orderBy){
        return iZlsgService.getListByTime(beginTime, endTime, pageNum, pageSize, orderBy);
    }
}
