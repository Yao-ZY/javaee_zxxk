package com.nuc.zxxk.sevice;

import com.nuc.zxxk.vo.ResponseVo;
import com.nuc.zxxk.pojo.User;

public interface userService<T> {
    /**
     * 登录功能
     * */
    ResponseVo<T> login(String username,String password);

    /**
     * 修改个人信息(密码修改): 老师信息；学生信息
     * */
    ResponseVo<String> update(String  password,String userId);

}
