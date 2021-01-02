package com.nuc.zxxk.enums;

import lombok.Getter;

@Getter
public enum ClassEnum {
    ERROR(-1,"暂无课程信息"),
    SUCCESS(1,"发布课程成功"),
    Fail(1,"发布课程失败")
    ;

    Integer code;
    String msg;
    ClassEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
