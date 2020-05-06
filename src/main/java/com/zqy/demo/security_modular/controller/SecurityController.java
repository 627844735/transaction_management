package com.zqy.demo.security_modular.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 971
 * @date 2020/5/6 11:58
 */
@Controller
@CrossOrigin
public class SecurityController {

    @GetMapping("/login")
    public String login() {
        return "/login.html";
    }

    @GetMapping("/index")
    public String getIndex(){
        return "/pages/index.html";
    }
}
