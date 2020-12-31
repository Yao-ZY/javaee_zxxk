package com.nuc.zxxk.sevice;

import com.nuc.zxxk.vo.ResponseVo;
import com.nuc.zxxk.pojo.User;

public interface userService<T> {

    ResponseVo<T> login(String username,String password);

}
