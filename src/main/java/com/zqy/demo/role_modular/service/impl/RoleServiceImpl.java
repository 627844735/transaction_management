package com.zqy.demo.role_modular.service.impl;


import com.zqy.demo.role_modular.mapper.RoleMapper;
import com.zqy.demo.role_modular.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 971
 * @date 2020/4/29 9:34
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 根据ID查询角色名
     * @param
     * @return
     */
    @Override
    public String fingByRoleId(Long roleId) {
        return roleMapper.findByRoleId(roleId);
    }
}
