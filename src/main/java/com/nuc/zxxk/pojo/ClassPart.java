package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class ClassPart {
    @NotBlank
    private String classname;
    @NotBlank
    private String classteacher;
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
    @NotBlank
    private String image;
}
