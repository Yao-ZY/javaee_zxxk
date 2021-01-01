package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.selectClass;

public interface selectClassMapper {
    int insert(selectClass record);

    int insertSelective(selectClass record);
    int countSelectClass(String userId);
}