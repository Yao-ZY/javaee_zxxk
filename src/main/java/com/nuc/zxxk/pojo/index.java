package com.nuc.zxxk.pojo;

import lombok.Data;

@Data
public class index {
    private int countTeacher;
    private int countClass;

    public index(int countTeacher, int countClass) {
        this.countTeacher = countTeacher;
        this.countClass = countClass;
        
    }
}
