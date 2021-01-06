package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Class {

    private String classid;
    private String image;
    private Integer peopleNum;
    private String classname;
    private String classteacher;
    private Integer classpeople;
    private String classweek;
    private String starttime;
    private String classhours;
    private Integer classcredit;
    private String classaddress;


}