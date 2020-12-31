package com.nuc.zxxk.Handlerinterceptor;

import com.nuc.zxxk.consts.*;
import com.nuc.zxxk.exception.UserLoginException;
import com.nuc.zxxk.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.getSession();
        User user = (User) request.getSession().getAttribute(ZXXKConst.CURRENT_USER);
        if(user==null){
            throw new UserLoginException();
//            return false;
//            return ResponseVo.error(ResponseEnum.NEED_LOGIN)
        }
        return true;
    }
}
