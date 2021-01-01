package com.nuc.zxxk.enums;

import lombok.Getter;

@Getter
public enum selectEnum {
    Error(2,"选课失败"),
    SUCCESS(0,"选课成功"),
    COUNT_ERROR(1,"您选择的课程已超过3节，不能再进行选课"),
    ;

    Integer code;
    String msg;
    selectEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
