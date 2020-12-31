package com.nuc.zxxk.sevice;

import com.github.pagehelper.PageInfo;
import com.nuc.zxxk.ResponseVo;
import com.nuc.zxxk.pojo.User;

public interface userService {

    ResponseVo<User> login(String username,String password);

}
