package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.student;

public interface studentMapper {
    int deleteByPrimaryKey(String userid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}