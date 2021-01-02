package com.nuc.zxxk.controller;

import com.nuc.zxxk.pojo.UserLoginFrom;
import com.nuc.zxxk.sevice.userService;
import com.nuc.zxxk.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    userService userService;
    @PostMapping("/updatePassword")
    public ResponseVo<String> update(@RequestBody UserLoginFrom user){
        return userService.update(user.getPassword(), user.getUserId());
    }

}
