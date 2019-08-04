package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserInfo;

public interface UserInfoService {

	public UserInfo selectById(Integer id);
    public List<UserInfo> findAllUser();

}