package com.nuc.zxxk.sevice;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.nuc.zxxk.pojo.*;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.web.bind.annotation.RequestParam;

public interface ClassService {
    /**
     * 展示所有课程列表
     * */
    ResponseVo<PageInfo> findAllClass(Integer pageNum, Integer pageSize);


    /**
     * 添加课程功能
     * */
    ResponseVo<String> insertClass(Class c);

    /**
     * 模糊搜索课程功能--根据老师/课程名
     * */
    ResponseVo<PageInfo> findClassByTeacher(String content,Integer pageNum, Integer pageSize);
    ResponseVo<PageInfo> findClassByClassName(String content,Integer pageNum, Integer pageSize);
    ResponseVo<PageInfo> findClassByTeacherAndClassName(String teacher,String className,Integer pageNum, Integer pageSize);
    /**
     * 老师根据课程查看学生
     * */
    ResponseVo<PageInfo> findClassByClassId(String classId,Integer pageNum, Integer pageSize);
    /**
     * 选课  修改课程数量加1
     * */
    int updateClassPeople(String classId,int num);
    /**
     * 删除选课
     * */
    ResponseVo<String> deleteClass(String classId);
    /**
     * 展示课程
     * */
    ResponseVo<Class>  showClass(String classId);
    /**
     * 修改课程信息
     * */
    ResponseVo<String> updateClass(ClassUpdate ClassUpdate);

    /**
     * 学生未选课程
     * */
    List<Class> findAllByUserId(String userId);
    /**
     * 学生按老师姓名进行查询
     * */
     List<Class> findAllByTeacher(String userId, String classTeacher);
}
