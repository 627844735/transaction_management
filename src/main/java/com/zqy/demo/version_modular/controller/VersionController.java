package com.zqy.demo.version_modular.controller;

import com.zqy.demo.common_modular.core.Result;
import com.zqy.demo.common_modular.core.ResultGenerator;
import com.zqy.demo.version_modular.entry.Version;
import com.zqy.demo.version_modular.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 971
 * @date 2020/5/6 16:19
 */
@RestController
@CrossOrigin
@RequestMapping("/version")
public class VersionController {

    @Autowired
    private VersionService versionService;

    /**
     * 查询最新的一次版本信息
     * @return
     */
    @GetMapping
    public Result getNewVersion(){
        Version version = versionService.getNewVersion();

        return ResultGenerator.genSuccessResult(version);
    }
}
