package com.nuc.zxxk.pojo;

public class User {
    private String userId;

    private String password;



    private Integer type;


    public String getId() {
        return userId;
    }

    public void setId(String id) {
        this.userId = userId == null ? null : userId.trim();
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public Integer getType() {
        return type;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }

    public void setType(Integer type) {
        this.type = type;
    }


}