package com.example.shopping.serivce.serviceImpl;

import com.example.shopping.R.AjaxResult;
import com.example.shopping.R.Status;
import com.example.shopping.dao.UserMapper;
import com.example.shopping.model.User;
import com.example.shopping.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

//新加
@ControllerAdvice(basePackages = "com.example.shopping.controller")//限制扫描的类包范围

@Service//spring框架下业务逻辑层标识，该层方法可以继续调用dao层
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public AjaxResult login(User user) {
        if(userMapper.login(user)==1){
            AjaxResult ajaxResult=new AjaxResult(user, Status.LOGINSUCCESS.getCode(), Status.LOGINSUCCESS.getMsg());
            return ajaxResult;
        }
        return new AjaxResult(user,Status.LOGINFAIL.getCode(),Status.LOGINFAIL.getMsg());
    }

    @Override
    public AjaxResult register(User user) {
        if(userMapper.countByUserName(user.getUsername())>0){
            AjaxResult<User> ajaxResult=new AjaxResult(user,Status.REGISTEREX.getCode(), Status.REGISTEREX.getMsg());
            return ajaxResult;
        }
        if(userMapper.register(user)==1){
            AjaxResult ajaxResult=new AjaxResult(user,Status.REGISTERSUCCESS.getCode(), Status.REGISTERSUCCESS.getMsg());
            return ajaxResult;
        }
        return new AjaxResult(user,Status.REGISTEREREX.getCode(), Status.REGISTEREREX.getMsg());

    }
}
