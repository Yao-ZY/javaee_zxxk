package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.Class;

public interface ClassMapper {
    int insert(Class record);

    int insertSelective(Class record);
}