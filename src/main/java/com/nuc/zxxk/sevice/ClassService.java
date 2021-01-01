package com.nuc.zxxk.sevice;

import java.util.List;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.vo.ResponseVo;

public interface ClassService {
    /**
     * 展示所有课程列表
     * */
    ResponseVo<List<Class>> findAllClass();

    /**
     * 添加课程功能
     * */
    ResponseVo<Class> insertClass(Class c);

    /**
     * 模糊搜索课程功能--根据老师/课程名
     * */
    ResponseVo<List<Class>> findClassByContent(String content);

    /**
     * 选课  数量加1
     * */
    void updateClassPeople(String classId);
}
