package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

	public User selectById(Integer id);
    public List<User> findAllUser();

}