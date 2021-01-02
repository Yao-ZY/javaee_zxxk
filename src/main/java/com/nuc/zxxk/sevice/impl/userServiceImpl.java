package com.nuc.zxxk.sevice.impl;

import com.nuc.zxxk.mapper.studentMapper;
import com.nuc.zxxk.mapper.teacherMapper;
import com.nuc.zxxk.pojo.UserStudent;
import com.nuc.zxxk.pojo.UserTeacher;
import com.nuc.zxxk.vo.ResponseVo;
import com.nuc.zxxk.enums.ResponseEnum;
import com.nuc.zxxk.mapper.UserMapper;
import com.nuc.zxxk.pojo.User;

import com.nuc.zxxk.sevice.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class userServiceImpl<T> implements userService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    studentMapper studentMapper;
    @Autowired
    teacherMapper teacherMapper;
    @Override
    public ResponseVo<T> login(String userId, String password) {
        User user = userMapper.selectByPrimaryKey(userId);
        UserStudent userStudent = null;
        UserTeacher userTeacher = null;
        if(user==null){
            //用户不存在
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }
        if(!user.getPassword().equalsIgnoreCase(password)){
            //密码错误
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }
        if(user.getType() == 2) {
            userStudent = studentMapper.selectUserStudent(userId);
            userStudent.setPassword("******");
            return (ResponseVo<T>) ResponseVo.success(userStudent);

        } else if(user.getType() == 1){
            userTeacher = teacherMapper.selectUserTeacher(userId);
            userTeacher.setPassword("******");
            return (ResponseVo<T>) ResponseVo.success(userTeacher );
        }
        user.setPassword("******");
        return (ResponseVo<T>) ResponseVo.success(user);
    }

    @Override
    public ResponseVo<String> update(String password, String userId) {
       int n= userMapper.updatePassword(password, userId);
       if(n == 0) return  ResponseVo.error(ResponseEnum.UPDATE_ERROR);
        return ResponseVo.error(ResponseEnum.UPDATE_SUCCESS);
    }


}
