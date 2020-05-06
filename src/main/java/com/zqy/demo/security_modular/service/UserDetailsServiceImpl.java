package com.zqy.demo.security_modular.service;


import com.zqy.demo.security_modular.entry.JwtUser;
import com.zqy.demo.user_modular.entry.User;
import com.zqy.demo.user_modular.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author 971
 * @date 2020/4/30 9:34
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(s);
        return new JwtUser(user);
    }
}
