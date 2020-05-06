package com.zqy.demo.user_modular.service;



import com.zqy.demo.user_modular.entry.User;

import java.util.List;

/**
 * @author 971
 * @date 2020/4/28 16:53
 */
public interface UserService {

    List<User> getUser();

    List<String> getUsernames();

    void signUp(User user);

    User getUserByUsername(String username);
}
