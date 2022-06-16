package com.example.Boardgame.controller;

import com.example.Boardgame.service.MyBatisService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import com.example.Boardgame.entity.User;
import com.example.Boardgame.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RequiredArgsConstructor 어노테이션을 사용한 "생성자 주입"
@RequiredArgsConstructor
@Controller
public class UserController {
    @Autowired
    MyBatisService myBatisService;

    @GetMapping(value = "/select")
    @ResponseBody
    public Map<String, Object> selectAllUser(){
        Map<String, Object> response = new HashMap<>();
//        List<User> userList = userService.selectAll();
//        System.out.println(userList)
//        response.put("result", userList);

        response.put("result", myBatisService.findAll());

        return response;
    }
}

