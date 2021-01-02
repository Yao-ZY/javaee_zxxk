package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.UserStudent;
import com.nuc.zxxk.pojo.student;

public interface studentMapper {

    UserStudent selectUserStudent(String userId);

}