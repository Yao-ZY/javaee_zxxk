package com.nuc.zxxk.controller;

import com.nuc.zxxk.pojo.selectClass;
import com.nuc.zxxk.sevice.selectClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class studentController {
    @Autowired
    selectClassService selectClassService;
    @RequestMapping("/selectClass")
    @ResponseBody
    ResponseVo<String> selectOne(selectClass selectClass){
        return selectClassService.selectOne(selectClass);
    }
}
