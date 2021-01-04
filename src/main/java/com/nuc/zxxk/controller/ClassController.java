package com.nuc.zxxk.controller;

import com.github.pagehelper.PageInfo;
import com.nuc.zxxk.enums.ClassEnum;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.pojo.ClassUpdate;
import com.nuc.zxxk.sevice.ClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    ClassService classService;
    /**
     * 删除课程
     * */
    @GetMapping("/deleteClass")
    ResponseVo<String> deleteClass(@RequestParam("classId") String classId) {
        return classService.deleteClass(classId);
    }
    /**
     * 根据老师1/课程名0/两者都进行查询2/进行搜索课程
     * */
    @GetMapping("/search")
    public ResponseVo<PageInfo> findClassByContent(@RequestParam(required = false,defaultValue = "") String classTeacher, @RequestParam(required = false,defaultValue = "") String className, @RequestParam(required = false,defaultValue = "1") Integer pageNum,
                                                   @RequestParam(required = false,defaultValue = "10") Integer pageSize){
        if(classTeacher.equals("")) {
            return classService.findClassByClassName(className,pageNum,pageSize);
        }else if(className.equals("")){
            return classService.findClassByTeacher(classTeacher,pageNum,pageSize);
        }else if(className.equals("") && classTeacher.equals("")){
            return ResponseVo.msg(ClassEnum.SELECT_NULL);
        }else{
            return classService.findClassByTeacherAndClassName(classTeacher, className,pageNum,pageSize);
        }
    }

    /***
     *
     * 详情展示页面
     */
    @GetMapping("/showClass")
    public ResponseVo<Class> showClass(@RequestParam("classId") String classId) {
       return classService.showClass(classId);
    }
    /**
     * 修改课程信息
     * */
    @PostMapping("/updateClass")
    public ResponseVo<String> updateClass(@Valid @RequestBody ClassUpdate ClassUpdate){
        return classService.updateClass(ClassUpdate);
    }
}
