package com.nuc.zxxk.controller;

import com.nuc.zxxk.mapper.ClassMapper;
import com.nuc.zxxk.pojo.*;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/teacher")
public class teacherController {
    @Autowired
    ClassMapper classMapper;
    /**
     * 发布选课
     * */
//    ResponseVo<Class> addClass(@RequestBody ClassPart classPart){
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMddhhmm");
//        System.out.println(dateFormat.format(date));
//        Class c = new Class(classPart.getClassname(),classPart.getClassteacher(),classPart.getClassweek(),classPart.);
//        c.setClassid(dateFormat.format(date));
//
//    }
}
