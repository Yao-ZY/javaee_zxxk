package com.nuc.zxxk.controller;
import com.nuc.zxxk.consts.*;
import com.nuc.zxxk.pojo.*;
import com.nuc.zxxk.vo.ResponseVo;
import com.nuc.zxxk.enums.ResponseEnum;
import com.nuc.zxxk.sevice.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping("/user")
public class loginController {
    @Autowired
    userService userService;
    /**
     * 登录
     * */
    @PostMapping("/login")
    public ResponseVo<User> login(@Valid @RequestBody  UserLoginFrom userLoginFrom,
                                  BindingResult bindingResult,
                                  HttpSession session){
        if(bindingResult.hasErrors()){
            return ResponseVo.error(ResponseEnum.PARAM_ERROR,
                    bindingResult.getFieldError().getField()+" "+bindingResult.getFieldError().getDefaultMessage());
        }
        ResponseVo<User> userResponseVo= userService.login(userLoginFrom.getUserId(),userLoginFrom.getPassword());
        //设置session
        session.setAttribute(ZXXKConst.CURRENT_USER,userResponseVo.getData());
        return userResponseVo;
    }
    /**
     * 登出
     * */
    @PostMapping("/loginOut")
    public ResponseVo<String> loginOut(HttpSession session) {
        session.setAttribute(ZXXKConst.CURRENT_USER,null);
        return ResponseVo.error(ResponseEnum.SUCCESS_OUT);
    }
    /**
     * 首页数量展示
     * */
    @PostMapping("/index")
    public ResponseVo<index> count(){
        return userService.count();
    }
}
