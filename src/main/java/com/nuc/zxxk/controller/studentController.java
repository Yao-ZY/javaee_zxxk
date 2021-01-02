package com.nuc.zxxk.controller;

import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.pojo.selectClass;
import com.nuc.zxxk.sevice.selectClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    selectClassService selectClassService;
    /**
     * 学生选课
     * */
    @GetMapping("/selectClass")
    ResponseVo<String> selectOne(@Valid @RequestBody selectClass selectClass){
        return selectClassService.selectOne(selectClass);
    }
    @GetMapping("/findSelectClass")
    public ResponseVo<List<Class>> selectClassByUserId(@RequestParam("userId") String userId){
        return selectClassService.selectClassByUserId(userId);
    }
}
