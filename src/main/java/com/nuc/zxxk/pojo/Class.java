package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Class {

    private String classid;
    @NotBlank
    private String classname;
    @NotBlank
    private String classteacher;

    private Integer classpeople;
    @NotBlank
    private String classweek;
    @NotBlank
    private String starttime;
    @NotBlank
    private String classhours;
    @NotBlank
    private Integer classcredit;
    @NotBlank
    private String classaddress;

}