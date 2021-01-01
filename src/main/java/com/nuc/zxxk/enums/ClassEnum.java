package com.nuc.zxxk.enums;

import lombok.Getter;

@Getter
public enum ClassEnum {
    ERROR(-1,"暂无课程信息"),
    ;

    Integer code;
    String msg;
    ClassEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
