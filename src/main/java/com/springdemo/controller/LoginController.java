package com.springdemo.controller;

import com.springdemo.dao.UserMapper;
import com.springdemo.model.UserVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    UserMapper user;

    @RequestMapping("/")
    public String index() throws  Exception{
        return "index";
    }

    @RequestMapping("/login")
    public String login() throws Exception {return "login";}

    @RequestMapping("/main")
    public List<UserVO> loginMain(Model model) throws Exception {
        List<UserVO> list = user.selectUsers();
        model.addAttribute("userList",list);
        return list;
    }
}

