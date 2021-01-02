package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.selectClass;

public interface selectClassMapper {
    int insert(selectClass record);
    int countSelectClass(String userId);
    int  countSelectClassByClassId(String classId);
}