package com.springdemo.service;

import com.springdemo.dao.UserMapper;
import com.springdemo.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper user;

    public List<UserVO> selectUsers(){
        return user.selectUsers();
    }
}
