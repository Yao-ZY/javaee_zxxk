package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.UserTeacher;
import com.nuc.zxxk.pojo.teacher;

public interface teacherMapper {
    public UserTeacher selectUserTeacher(String userId);

}