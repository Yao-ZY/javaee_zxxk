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
        int classPeople = classMapper.selectClass(selectClass.getClassId());
        int m=  selectClassMapper.countSelectClassByClassIdAndUserId(selectClass.getClassId(),selectClass.getUserId());
        if(m > 0) {
            return ResponseVo.msg(selectEnum.TEACHER_ERROR);
        }
        int n = 0;
        if(num == 3) {
            return ResponseVo.msg(selectEnum.COUNT_ERROR);
        }else if(numClass < classPeople){
            n = selectClassMapper.insert(selectClass);
            classMapper.updateClassPeople(selectClass.getClassId(),numClass);
        }else {
            return ResponseVo.msg(selectEnum.NUM_ERROR);
        }
        if(n == 0) {
            return  ResponseVo.msg(selectEnum.Error);
        } else
        return  ResponseVo.msg(selectEnum.SUCCESS);
    }

    @Override
    public ResponseVo<List<Class>> selectClassByUserId(String userId) {
        List<Class> classList = selectClassMapper.findAllSelectClassByUserId(userId);
        if(classList.size() == 0) return ResponseVo.msg(selectEnum.SELECT_ERROR);
        return ResponseVo.success(classList);
    }

    @Override
    public int countSelectClass(String userId) {
        return selectClassMapper.countSelectClass(userId);
    }

    @Override
    public ResponseVo<String> deleteSelectClass(String classId, String userId) {
        int n = selectClassMapper.deleteSelectClass(classId, userId);
        if(n == 0) return ResponseVo.msg(selectEnum.DELETE_ERROR);
        return ResponseVo.msg(selectEnum.DELETE_SUCCESS);
    }
}
