package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.pojo.selectClass;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface selectClassMapper {
    int insert(selectClass record);
    int countSelectClass(String userId);
    int  countSelectClassByClassId(String classId);
    @Select("select count(*) from selectClass where classId=#{classId} and userId=#{userId}")
    int countSelectClassByClassIdAndUserId(String classId,String userId);
    List<Class> findAllSelectClassByUserId(String userId);
    @Delete("delete from selectClass where classId=#{classId}")
    int deleteSelect(String classId);
    @Delete("delete from selectClass where classId=#{classId} and userId=#{userId}")
    int deleteSelectClass(String classId,String userId);
}