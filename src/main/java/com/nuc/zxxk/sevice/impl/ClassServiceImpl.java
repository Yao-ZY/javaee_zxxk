package com.nuc.zxxk.sevice.impl;

import com.github.pagehelper.PageInfo;
import com.nuc.zxxk.enums.ClassEnum;
import com.nuc.zxxk.mapper.ClassMapper;
import com.nuc.zxxk.mapper.selectClassMapper;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.pojo.ClassUpdate;
import com.nuc.zxxk.pojo.student;
import com.nuc.zxxk.sevice.ClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassMapper classMapper;
    @Autowired
    selectClassMapper selectClassMapper;
    @Override
    public ResponseVo<PageInfo>  findAllClass(Integer pageNum, Integer pageSize) {
        List<Class> s_class = classMapper.findAllClass();
        List<Class> productCategoryVoList = s_class.stream()
                .map(e->{
                    Class productCategoryVo = new Class();
                    BeanUtils.copyProperties(e,productCategoryVo);
                    return productCategoryVo;
                })
                .collect(Collectors.toList());
        PageInfo pageInfo = new PageInfo(s_class);
        pageInfo.setList(productCategoryVoList);
        return ResponseVo.success(pageInfo);
    }

    @Override
    public ResponseVo<String> insertClass(Class c) {
        int n= 0;
        n=classMapper.insert(c);
        if(n == 0) {
            return ResponseVo.msg(ClassEnum.Fail);
        }
        return ResponseVo.msg(ClassEnum.SUCCESS);
    }

    @Override
    public ResponseVo<PageInfo> findClassByTeacher(String content,Integer pageNum, Integer pageSize) {
        List<Class> classList = classMapper.findClassByTeacher(content);
        if(classList == null) {
            return ResponseVo.msg(ClassEnum.SEARCH_ERROR);
        }
        List<Class> productCategoryVoList = classList.stream()
                .map(e->{
                    Class productCategoryVo = new Class();
                    BeanUtils.copyProperties(e,productCategoryVo);
                    return productCategoryVo;
                })
                .collect(Collectors.toList());
        PageInfo pageInfo = new PageInfo(classList);
        pageInfo.setList(productCategoryVoList);
        return ResponseVo.success(pageInfo);
    }

    @Override
    public ResponseVo<PageInfo> findClassByClassName(String content,Integer pageNum, Integer pageSize) {
        List<Class> classList = classMapper.findClassByClassName(content);
        if(classList == null) {
            return ResponseVo.msg(ClassEnum.SEARCH_ERROR);
        }
        List<Class> productCategoryVoList = classList.stream()
                .map(e->{
                    Class productCategoryVo = new Class();
                    BeanUtils.copyProperties(e,productCategoryVo);
                    return productCategoryVo;
                })
                .collect(Collectors.toList());
        PageInfo pageInfo = new PageInfo(classList);
        pageInfo.setList(productCategoryVoList);
        return ResponseVo.success(pageInfo);
    }

    @Override
    public ResponseVo<PageInfo> findClassByTeacherAndClassName(String teacher, String className,Integer pageNum, Integer pageSize) {
        List<Class> classList = classMapper.findClassByTeacherAndClassName(teacher, className);
        if(classList == null) {
            return ResponseVo.msg(ClassEnum.SEARCH_ERROR);
        }
        List<Class> productCategoryVoList = classList.stream()
                .map(e->{
                    Class productCategoryVo = new Class();
                    BeanUtils.copyProperties(e,productCategoryVo);
                    return productCategoryVo;
                })
                .collect(Collectors.toList());
        PageInfo pageInfo = new PageInfo(classList);
        pageInfo.setList(productCategoryVoList);
        return ResponseVo.success(pageInfo);
    }


    @Override
    public ResponseVo<PageInfo> findClassByClassId(String classId,Integer pageNum, Integer pageSize) {
        List<student> c_student = classMapper.findClassByClassId(classId);
        System.out.println(c_student.get(0).toString());
        List<student> productCategoryVoList = c_student.stream()
                .map(e->{
                    student productCategoryVo = new student();
                    BeanUtils.copyProperties(e,productCategoryVo);
                    return productCategoryVo;
                })
                .collect(Collectors.toList());
        PageInfo pageInfo = new PageInfo(c_student);
        pageInfo.setList(productCategoryVoList);
        return ResponseVo.success(pageInfo);
    }

    @Override
    public int updateClassPeople(String classId,int num) {
        return classMapper.updateClassPeople(classId,num);
    }

    @Override
    public ResponseVo<String> deleteClass(String classId) {
        int n = classMapper.deleteClass(classId);
        selectClassMapper.deleteSelect(classId);
        if(n == 0)
            return ResponseVo.msg(ClassEnum.DELETE_ERROR);
        else
        return ResponseVo.msg(ClassEnum.DELETE_SUCCESS);
    }

    @Override
    public ResponseVo<Class> showClass(String classId) {
        Class c = classMapper.showClass(classId);
        if(c==null) return ResponseVo.msg(ClassEnum.SHOW_ERROR);
        return ResponseVo.success(c);
    }

    @Override
    public ResponseVo<String> updateClass(ClassUpdate ClassUpdate) {
        int n = classMapper.updateClass(ClassUpdate);
        if(n == 0) return ResponseVo.msg(ClassEnum.UPDATE_ERROR);
        return ResponseVo.msg(ClassEnum.UPDATE_SUCCESS);
    }

    @Override
    public List<Class> findAllByUserId(String userId) {
        return classMapper.findAllByUserId(userId);
    }

    @Override
    public List<Class> findAllByTeacher(String userId, String classTeacher) {
        return classMapper.findAllByTeacher(userId,classTeacher);
    }
}
