package com.nuc.zxxk.enums;

import lombok.Getter;

@Getter
public enum ClassEnum {
    ERROR(-1,"暂无课程信息"),
    SUCCESS(1,"发布课程成功"),
    Fail(2,"发布课程失败"),
    DELETE_SUCCESS(3,"删除选课成功"),
    DELETE_ERROR(4,"删除选课失败"),
    SEARCH_ERROR(5,"没有数据"),
    SELECT_NULL(6,"请填写查找信息"),
    SHOW_ERROR(7,"查看课程失败"),
    UPDATE_ERROR(8,"修改课程信息失败"),
    UPDATE_SUCCESS(9,"修改课程信息成功"),
    SELECT_ERROR(10,"您的课程暂无人员选课")
    ;

    Integer code;
    String msg;
    ClassEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
