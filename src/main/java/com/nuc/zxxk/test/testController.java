package com.nuc.zxxk.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "测试成功，成功运行!";
    }

}
