package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.pojo.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface ClassMapper {
    int insert(Class record);
    List<Class>  findAllClass();
    @Update("UPDATE `Class` SET peopleNum=#{peopleNum} WHERE classId=#{classId}")
    int updateClassPeople(@Param("classId") String classId,@Param("peopleNum") int peopleNum);
    @Select("select classPeople from `Class` where classId=#{classId}")
    int selectClass(String classId);
    List<student> findClassByClassId(String classId);
}