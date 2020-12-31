package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserLoginFrom {
    @NotBlank
    private String userId;

    @NotBlank
    private String password;
}