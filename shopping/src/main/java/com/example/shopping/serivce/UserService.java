package com.example.shopping.serivce;

import com.example.shopping.R.AjaxResult;
import com.example.shopping.model.User;

public interface UserService {
    AjaxResult login(User user);
    AjaxResult register(User user);
}
