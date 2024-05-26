package com.example.shopping.controller;

import com.example.shopping.R.AjaxResult;
import com.example.shopping.model.User;
import com.example.shopping.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller是spring框架提供的注解，表示控制层
// 【分发处理器会扫描使用该注解的类的方法，并检测该方法是否使用了@RequestMapping注解，而使用@RequestMapping注解的方法才是处理请求的处理器】
@RestController//=@Controller+@RequestBody
@RequestMapping("/user")//@RequestMapping给出外界访问方法的路径，或者说触发路径，触发条件。
public class UserController {
    @Autowired//标注在属性上，来完成自动装配
    private UserService userService;//Service层作为属性，供以下方法调用

    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){return userService.login(user);}

    @PostMapping("/register")
    public AjaxResult register(@RequestBody User user){return userService.register(user);}
                            //@ResponseBody标记Controller类中的方法。把return的结果变成JSON对象返回。
                            // 如果没有这个注解，这个方法只能返回要跳转的路径，即跳转的页面。有这个注解，可以不跳转页面，只返回JSON数据。
}

