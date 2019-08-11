package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Permission;

public interface  PermissionService {
    List<Permission> findUserPermissions(String account);
}