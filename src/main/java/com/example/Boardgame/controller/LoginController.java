package com.example.Boardgame.controller;

import com.example.Boardgame.entity.User;
import com.example.Boardgame.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }


    @GetMapping("/login")
    @ResponseBody
    public String loginId(@ModelAttribute User user) {
        System.out.println("로그인22");
        if(loginService.login(user)){

            return "Ok";
        }else{
            return "Fail";
        }

    }
}

