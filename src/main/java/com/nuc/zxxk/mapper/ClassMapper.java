package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.Class;

import java.util.List;

public interface ClassMapper {
    int insert(Class record);
    List<Class>  findAllClass();
    void updateClassPeople(String classId);
}