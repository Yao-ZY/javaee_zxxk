package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.pojo.selectClass;

import java.util.List;

public interface selectClassMapper {
    int insert(selectClass record);
    int countSelectClass(String userId);
    int  countSelectClassByClassId(String classId);
    List<Class> findAllSelectClassByUserId(String userId);
}