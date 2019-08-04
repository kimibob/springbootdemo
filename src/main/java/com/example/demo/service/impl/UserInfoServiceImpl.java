package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectById(Integer id){
        return userInfoMapper.selectById(id);
    }
    public List<UserInfo> findAllUser() {
        List<UserInfo> list = userInfoMapper.findAll();
        return list;
    }
}	