package com.zqy.demo.user_modular.service.impl;


import com.zqy.demo.role_modular.mapper.RoleMapper;
import com.zqy.demo.user_modular.entry.User;
import com.zqy.demo.user_modular.mapper.UserMapper;
import com.zqy.demo.user_modular.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 971
 * @date 2020/4/28 16:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> getUser() {
        List<User> users = userMapper.getUser();

        //查询用户的角色信息以及格式化时间
        for (User user : users) {
            user.setRole(roleMapper.findByRoleId(user.getUserRoleId()));
        }

        return users;
    }

    /**
     * 查询所有用户的用户名
     * @return
     */
    @Override
    public List<String> getUsernames() {
        return userMapper.getUsernames();
    }

    /**
     * 注册接口
     * @param user
     */
    @Override
    @Transactional
    public void signUp(User user) {
        userMapper.signUp(user);
    }

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    @Override
    public User getUserByUsername(String username) {
        User user = userMapper.loadUserByUsername(username);
        user.setRole(roleMapper.findByRoleId(user.getUserRoleId()));

        return user;
    }
}
