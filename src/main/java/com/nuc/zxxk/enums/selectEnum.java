package com.nuc.zxxk.enums;

import lombok.Getter;

@Getter
public enum selectEnum {
    Error(2,"选课失败"),
    SUCCESS(0,"选课成功"),
    SELECT_ERROR(3,"没有您的选课记录"),
    NUM_ERROR(4,"人数已满，不能进行选课"),
    TEACHER_ERROR(5,"已选该课程，不能重复选择"),
    COUNT_ERROR(1,"您选择的课程已超过3节，不能再进行选课"),
    DELETE_ERROR(6,"删除选课失败"),
    DELETE_SUCCESS(7,"删除选课成功"),
    ;

    Integer code;
    String msg;
    selectEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
