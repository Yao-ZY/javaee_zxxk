package com.nuc.zxxk.controller;

import com.nuc.zxxk.mapper.ClassMapper;
import com.nuc.zxxk.pojo.ClassPart;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class teacherController {
    @Autowired
    ClassMapper classMapper;
    /**
     * 发布选课
     * */
//    ResponseVo<Class> addClass(@RequestBody ClassPart classPart){
//
//    }
}
