package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserLoginFrom {
    @NotBlank(message = "用户工号不能为空，请填写你的学号/工号")
    private String userId;

    @NotBlank(message = "密码不能为空")
    private String password;

}