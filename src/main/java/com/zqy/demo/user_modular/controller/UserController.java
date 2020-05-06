package com.zqy.demo.user_modular.controller;

import com.zqy.demo.common_modular.core.Result;
import com.zqy.demo.common_modular.core.ResultGenerator;
import com.zqy.demo.common_modular.utils.DateUtil;
import com.zqy.demo.user_modular.entry.User;
import com.zqy.demo.user_modular.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author 971
 * @date 2020/4/28 16:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    /**
     * 查询所有用户
     * @return
     */
    @GetMapping
    public Result getUsers(){
        List<User> users = userService.getUser();

        if(users == null || users.size() <= 0){
            return ResultGenerator.genFailResult("暂无用户数据");
        }else{
            return ResultGenerator.genSuccessResult(users);
        }
    }

    /**
     * 注册接口
     * @param user
     */
    @PostMapping("/signup")
    public void signUp(@RequestBody User user){
        //判断用户名是否重复
        List<String> usernames = userService.getUsernames();
        for (String username : usernames) {
            if(username.equals(user.getUsername()) || user.getUsername().equals("")){
                log.info("用户名重复或用户名不合法:"+user.getUsername());
                return;
            }
        }

        //用户密码加密
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        user.setUserCreateDate(DateUtil.getDateFormat(new Date(),"yyyy-MM-dd"));

        //添加
        userService.signUp(user);
    }

}
