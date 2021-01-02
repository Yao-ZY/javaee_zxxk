package com.nuc.zxxk.controller;

import com.github.pagehelper.PageInfo;
import com.nuc.zxxk.enums.ClassEnum;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.sevice.ClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class adminController {
      @Autowired
      ClassService classService;
       /**
        * 分页PageInfo展示所有课程
        * */
       @RequestMapping("/findAllClass")
       @ResponseBody
       public ResponseVo<PageInfo> findAllClass(@RequestParam(required = false,defaultValue = "1") Integer pageNum,
                                                      @RequestParam(required = false,defaultValue = "10") Integer pageSize) {
           return classService.findAllClass(pageNum, pageSize);
       }

     /**
      * 根据老师进行搜索
      * */
}
