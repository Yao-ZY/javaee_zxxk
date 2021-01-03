package com.nuc.zxxk.controller;

import com.nuc.zxxk.pojo.selectClass;
import com.nuc.zxxk.sevice.selectClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/selectClass")
public class selectClassController {
    @Autowired
    selectClassService selectClassService;
    @PostMapping("/deleteSelect")
    public ResponseVo<String> deleteSelectClass(@Valid @RequestBody selectClass selectClass){
       return  selectClassService.deleteSelectClass(selectClass.getClassId(), selectClass.getUserId());
    }
    /**
     * 学生选课
     * */
    @PostMapping("/selectClass")
    ResponseVo<String> selectOne(@Valid @RequestBody selectClass selectClass){
        return selectClassService.selectOne(selectClass);
    }
}
