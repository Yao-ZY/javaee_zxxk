package com.nuc.zxxk.sevice;

import com.nuc.zxxk.pojo.selectClass;
import com.nuc.zxxk.vo.ResponseVo;
import com.nuc.zxxk.pojo.Class;
import java.util.List;

public interface selectClassService {
    /**
     * 学生选课
     * */
    public ResponseVo<String> selectOne(selectClass selectClass);

    /**
     * 根据Id查看学生选课
     * */
    public ResponseVo<List<Class>> selectClassByUserId(String userId);

    /**
     * 获取学生选课数量
     * */
    public int countSelectClass(String userId);

    /**
     * 删除选课信息
     * */
    ResponseVo<String> deleteSelectClass(String classId,String userId);
}
