package com.nuc.zxxk.sevice;

import com.nuc.zxxk.pojo.UserStudent;


public interface studentService {
    public UserStudent findByUserId(String userId);
}
