package com.zqy.demo.user_modular.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.zqy.demo.user_modular.entry.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 971
 * @date 2020/4/28 16:53
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> getUser();

    void signUp(User user);

    List<String> getUsernames();

    User loadUserByUsername(String username);

}
