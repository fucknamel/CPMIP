package com.cpmip.controller;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Aqsg;
import com.cpmip.service.IAqsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aqsg/")
public class AqsgController {

    @Autowired
    private IAqsgService iAqsgService;

    @RequestMapping(value = "add.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse add(Aqsg item){
        return iAqsgService.add(item);
    }
}
