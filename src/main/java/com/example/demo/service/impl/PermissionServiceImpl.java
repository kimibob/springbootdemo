package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.PermissionMapper;
import com.example.demo.model.Permission;
import com.example.demo.service.PermissionService;

@Service("PermissionService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper mapper;
    @Override
    public List<Permission> findUserPermissions(String account) {
        return this.mapper.findUserPermissions(account);
    }
}