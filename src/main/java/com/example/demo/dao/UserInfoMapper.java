package com.example.demo.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.UserInfo;

@Mapper
public interface UserInfoMapper {

	public UserInfo selectById(@Param("id") Integer id);
	public List<UserInfo> findAll();
}