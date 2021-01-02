package com.nuc.zxxk.sevice.impl;

import com.nuc.zxxk.mapper.ClassMapper;
import com.nuc.zxxk.mapper.selectClassMapper;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.pojo.selectClass;
import com.nuc.zxxk.sevice.selectClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.nuc.zxxk.enums.*;
import java.util.List;

@Service
@Transactional
public class selectClassServiceImpl implements selectClassService {
    @Autowired
    selectClassMapper selectClassMapper;
    @Autowired
    ClassMapper classMapper;
    @Override
    public ResponseVo<String> selectOne(selectClass selectClass) {
        int num = countSelectClass(selectClass.getUserId());
        int numClass = selectClassMapper.countSelectClassByClassId(selectClass.getClassId())+1;
        System.out.println("选课数量："+numClass);
        int n = 0;
        if(num == 3) {
            return ResponseVo.msg(selectEnum.COUNT_ERROR);
        }else {
            n = selectClassMapper.insert(selectClass);
           int eist= classMapper.updateClassPeople(selectClass.getClassId(),numClass);
            System.out.println("是否运行该sql语句："+eist);
        }
        if(n == 0) {
            return  ResponseVo.msg(selectEnum.Error);
        } else
        return  ResponseVo.msg(selectEnum.SUCCESS);
    }

    @Override
    public ResponseVo<List<Class>> selectClassByUserId(String userId) {
        return null;
    }

    @Override
    public int countSelectClass(String userId) {
        return selectClassMapper.countSelectClass(userId);
    }
}
