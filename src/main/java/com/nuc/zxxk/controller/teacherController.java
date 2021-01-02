package com.nuc.zxxk.controller;

import com.github.pagehelper.PageInfo;
import com.nuc.zxxk.mapper.ClassMapper;
import com.nuc.zxxk.pojo.*;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.sevice.ClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/addClass")
    ResponseVo<String> addClass(@Valid  @RequestBody ClassPart classPart){
        // 设定Id
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMddhhmm");
        // 插入Class
        Class c = new Class();
        c.setPeopleNum(0);
        c.setClasspeople(classPart.getClasspeople());
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

    /**
     * 查询课程人员
     * */
    @GetMapping("/findStudent")
    ResponseVo<PageInfo> findClassByClassId(@Param("classId") String classId, @RequestParam(required = false,defaultValue = "1") Integer pageNum,
                                            @RequestParam(required = false,defaultValue = "10") Integer pageSize){
        return classService.findClassByClassId(classId, pageNum, pageSize);
    }
}
