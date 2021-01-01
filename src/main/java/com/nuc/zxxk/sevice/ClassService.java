package com.nuc.zxxk.sevice;

import java.util.List;
import com.nuc.zxxk.pojo.Class;
import com.nuc.zxxk.vo.ResponseVo;

public interface ClassService {
    ResponseVo<List<Class>> findAllClass();
}
