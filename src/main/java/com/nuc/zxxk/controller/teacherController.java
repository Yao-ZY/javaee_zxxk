package com.nuc.zxxk.controller;

import com.nuc.zxxk.mapper.ClassMapper;
import com.nuc.zxxk.pojo.*;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.sevice.ClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/teacher")
public class teacherController {
    @Autowired
    ClassService classService;
    /**
     * 发布选课
     * */
    @RequestMapping("/addClass")
    ResponseVo<String> addClass(@Valid  @RequestBody ClassPart classPart){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMddhhmm");
        System.out.println(dateFormat.format(date));
        Class c = new Class();
        c.setClasspeople(0);
        c.setClassid(dateFormat.format(date));
        c.setClassname(classPart.getClassname());
        c.setClassteacher(classPart.getClassteacher());
        c.setClassweek(classPart.getClassweek());
        c.setStarttime(classPart.getStarttime());
        c.setClasshours(classPart.getClasshours());
        c.setClasscredit(classPart.getClasscredit());
        c.setClassaddress(classPart.getClassaddress());
        c.setImage(classPart.getImage());
        return classService.insertClass(c);
    }
}
