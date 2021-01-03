package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.UserTeacher;
import com.nuc.zxxk.pojo.teacher;
import org.apache.ibatis.annotations.Select;

public interface teacherMapper {
    public UserTeacher selectUserTeacher(String userId);
    @Select("select count(*) from teacher")
    int countTeacher();
}