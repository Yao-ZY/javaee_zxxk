package com.nuc.zxxk.pojo;

public class Class {
    private String classid;

    private String classname;

    private String classteacher;

    private Integer classpeople;

    private String classweek;

    private String starttime;

    private String classhours;

    private Integer classcredit;

    private String classaddress;

    private String grade;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getClassteacher() {
        return classteacher;
    }

    public void setClassteacher(String classteacher) {
        this.classteacher = classteacher == null ? null : classteacher.trim();
    }

    public Integer getClasspeople() {
        return classpeople;
    }

    public void setClasspeople(Integer classpeople) {
        this.classpeople = classpeople;
    }

    public String getClassweek() {
        return classweek;
    }

    public void setClassweek(String classweek) {
        this.classweek = classweek == null ? null : classweek.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getClasshours() {
        return classhours;
    }

    public void setClasshours(String classhours) {
        this.classhours = classhours == null ? null : classhours.trim();
    }

    public Integer getClasscredit() {
        return classcredit;
    }

    public void setClasscredit(Integer classcredit) {
        this.classcredit = classcredit;
    }

    public String getClassaddress() {
        return classaddress;
    }

    public void setClassaddress(String classaddress) {
        this.classaddress = classaddress == null ? null : classaddress.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}