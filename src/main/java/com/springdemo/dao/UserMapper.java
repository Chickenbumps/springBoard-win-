package com.springdemo.dao;

import com.springdemo.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserVO> selectUsers();
}
