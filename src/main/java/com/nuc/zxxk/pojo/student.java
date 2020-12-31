package com.nuc.zxxk.pojo;

public class student {
    private String userId;

    private String username;

    private String grade;

    private String sClass;

    private String startyear;

    private String endyear;

    private String dept;

    public String getUserid() {
        return userId;
    }

    public void setUserid(String userid) {
        this.userId = userId == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass == null ? null : sClass.trim();
    }

    public String getStartyear() {
        return startyear;
    }

    public void setStartyear(String startyear) {
        this.startyear = startyear == null ? null : startyear.trim();
    }

    public String getEndyear() {
        return endyear;
    }

    public void setEndyear(String endyear) {
        this.endyear = endyear == null ? null : endyear.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }
}