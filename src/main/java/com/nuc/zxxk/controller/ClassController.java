package com.nuc.zxxk.controller;

import com.nuc.zxxk.sevice.ClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    ClassService classService;
    /**
     * 删除选课
     * */
    @GetMapping("/deleteClass")
    ResponseVo<String> deleteClass(@RequestParam("classId") String classId) {
        return classService.deleteClass(classId);
    }
    /**
     * 根据老师/课程名进行搜索课程
     * */
}
