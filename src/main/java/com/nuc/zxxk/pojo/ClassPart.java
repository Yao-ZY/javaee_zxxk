package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ClassPart {
    @NotBlank(message = "课程名不能为空")
    private String classname;
    @NotBlank(message = "课程老师不能为空")
    private String classteacher;
    @NotBlank(message = "课程周期不能为空")
    private String classweek;
    @NotNull(message = "课程人数不能为空")
    private Integer classpeople;
    @NotBlank(message = "开始周不能为空")
    private String starttime;
    @NotBlank(message = "开课时间不能为空")
    private String classhours;
    @NotNull(message = "课程学分不能为空")
    private Integer classcredit;
    @NotBlank(message = "课程地址不能为空")
    private String classaddress;
    @NotBlank(message = "课程图片不能为空")
    private String image;

}
