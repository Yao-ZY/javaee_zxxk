package com.nuc.zxxk.sevice.impl;

import com.nuc.zxxk.enums.ClassEnum;
import com.nuc.zxxk.mapper.ClassMapper;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.sevice.ClassService;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassMapper classMapper;
    @Override
    public ResponseVo<List<Class>>  findAllClass() {
        List<Class> s_class = classMapper.findAllClass();
        if(s_class == null) {
            return ResponseVo.error(ClassEnum.ERROR);
        }
        return  ResponseVo.success(s_class);
    }
}
