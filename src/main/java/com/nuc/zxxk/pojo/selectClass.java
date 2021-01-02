package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class selectClass {
    @NotBlank(message = "课程Id不能为空")
    private String classId;
    @NotBlank(message = "用户Id不能为空")
    private String userId;

}