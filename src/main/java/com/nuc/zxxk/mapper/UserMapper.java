package com.nuc.zxxk.mapper;

import com.nuc.zxxk.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {


    User selectByPrimaryKey(String id);
    @Update("update user set password=#{password} where userId=#{userId}")
    int updatePassword(@Param("password") String password,@Param("userId") String userId);
}