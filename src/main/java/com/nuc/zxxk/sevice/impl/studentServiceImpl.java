package com.nuc.zxxk.sevice.impl;

import com.nuc.zxxk.mapper.studentMapper;
import com.nuc.zxxk.pojo.UserStudent;
import com.nuc.zxxk.sevice.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class studentServiceImpl implements studentService {
    @Autowired
    studentMapper studentMapper;
    @Override
    public UserStudent findByUserId(String userId) {
        return studentMapper.selectUserStudent(userId);
    }
}
