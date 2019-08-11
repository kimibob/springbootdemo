package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

	@Override
	public User selectById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> findAllUser() {
		return userMapper.selectAll();
	}

}	