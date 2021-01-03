package com.nuc.zxxk.controller;

import com.nuc.zxxk.pojo.selectClass;
import com.nuc.zxxk.sevice.selectClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/selectClass")
public class selectClassController {
    @Autowired
    selectClassService selectClassService;
    @GetMapping("/deleteSelect")
    public ResponseVo<String> deleteSelectClass(@Valid @RequestBody selectClass selectClass){
       return  selectClassService.deleteSelectClass(selectClass.getClassId(), selectClass.getUserId());
    }
    /**
     * 学生选课
     * */
    @GetMapping("/selectClass")
    ResponseVo<String> selectOne(@Valid @RequestBody selectClass selectClass){
        return selectClassService.selectOne(selectClass);
    }
}
