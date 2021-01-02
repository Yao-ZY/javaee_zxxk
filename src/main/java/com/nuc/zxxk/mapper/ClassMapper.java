package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.Class;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Mapper
public interface ClassMapper {
    int insert(Class record);
    List<Class>  findAllClass();
    @Update("UPDATE `Class` SET classPeople=#{classPeople} WHERE classId=#{classId}")
    int updateClassPeople(@Param("classId") String classId,@Param("classPeople") int classPeople);
}