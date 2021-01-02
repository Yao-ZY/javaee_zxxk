package com.nuc.zxxk.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ClassUpdate {
    @NotBlank(message = "请传递完整数据")
    private String classid;
    @NotBlank(message = "请传递完整数据")
    private String image;
    @NotNull(message = "请传递完整数据")
    private Integer classpeople;
    @NotBlank(message = "请传递完整数据")
    private String classweek;
    @NotBlank(message = "请传递完整数据")
    private String starttime;
    @NotBlank(message = "请传递完整数据")
    private String classhours;
    @NotNull(message = "请传递完整数据")
    private Integer classcredit;
    @NotBlank(message = "请传递完整数据")
    private String classaddress;
}
