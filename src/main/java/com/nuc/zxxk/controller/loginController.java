package com.nuc.zxxk.controller;
import com.nuc.zxxk.consts.*;
import com.nuc.zxxk.pojo.UserTeacher;
import com.nuc.zxxk.vo.ResponseVo;
import com.nuc.zxxk.enums.ResponseEnum;
import com.nuc.zxxk.pojo.User;
import com.nuc.zxxk.pojo.UserLoginFrom;
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

    @PostMapping("/loginOut")
    public String loginOut(HttpSession session) {
        session.setAttribute(ZXXKConst.CURRENT_USER,null);
        session.setAttribute("type",null);
        return "退出登录";
    }
    @GetMapping("/userInfo")
    public <T> Object userInfo(HttpSession session){
        return   session.getAttribute(ZXXKConst.CURRENT_USER);
    }
}
