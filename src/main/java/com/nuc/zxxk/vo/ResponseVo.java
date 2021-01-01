package com.nuc.zxxk.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nuc.zxxk.enums.ClassEnum;
import com.nuc.zxxk.enums.ResponseEnum;
import com.nuc.zxxk.enums.selectEnum;
import lombok.Data;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ResponseVo<T> {
    private Integer status;
    private String msg;
    private T data;

    private ResponseVo(Integer status, String msg){
        this.status = status;
        this.msg = msg;
    }
    private ResponseVo(Integer status, T data){
        this.status = status;
        this.data = data;
    }

    public static <T> ResponseVo<T> successByMsg(String msg){
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(),msg);
    }
    public static <T> ResponseVo<T> success(){
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(),ResponseEnum.SUCCESS.getDesc());
    }
    public static <T> ResponseVo<T> success(T data){
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(),data);
    }
    public static <T> ResponseVo<T> error(ResponseEnum responseEnum){
        return new ResponseVo<>(responseEnum.getCode(),responseEnum.getDesc());
    }
    public static <T> ResponseVo<T> error(selectEnum responseEnum){
        return new ResponseVo<>(responseEnum.getCode(),responseEnum.getMsg());
    }
    public static <T> ResponseVo<T> error(ClassEnum responseEnum){
        return new ResponseVo<>(responseEnum.getCode(),responseEnum.getMsg());
    }
    public static <T> ResponseVo<T> error(ResponseEnum responseEnum,String msg){
        return new ResponseVo<>(responseEnum.getCode(),msg);
    }
}
