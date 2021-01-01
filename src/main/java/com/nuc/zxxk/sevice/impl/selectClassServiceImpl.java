package com.nuc.zxxk.sevice.impl;

import com.nuc.zxxk.enums.ResponseEnum;
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
        if(num == 3) {
            return ResponseVo.error(selectEnum.COUNT_ERROR);
        }
        selectClassMapper.insert(selectClass);
        classMapper.updateClassPeople(selectClass.getUserId());
        return  ResponseVo.error(selectEnum.SUCCESS);
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
