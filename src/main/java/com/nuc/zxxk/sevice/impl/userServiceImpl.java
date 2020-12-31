package com.nuc.zxxk.sevice.impl;

import com.nuc.zxxk.ResponseVo;
import com.nuc.zxxk.enums.ResponseEnum;
import com.nuc.zxxk.mapper.UserMapper;
import com.nuc.zxxk.pojo.User;

import com.nuc.zxxk.sevice.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
@Service
@Transactional
public class userServiceImpl implements userService {
    @Autowired
    UserMapper userMapper;
    @Override
    public ResponseVo<User> login(String userId, String password) {
        User user = userMapper.selectByPrimaryKey(userId);
        if(user==null){
            //用户不存在
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }
        if(!user.getPassword().equalsIgnoreCase(DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)))){
            //密码错误
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }
        user.setPassword("");
        return ResponseVo.success(user);
    }
}
