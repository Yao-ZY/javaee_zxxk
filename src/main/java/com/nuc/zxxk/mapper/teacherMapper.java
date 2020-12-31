package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.teacher;

public interface teacherMapper {
    int deleteByPrimaryKey(String userid);

    int insert(teacher record);

    int insertSelective(teacher record);

    teacher selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(teacher record);

    int updateByPrimaryKey(teacher record);
}