package com.zqy.demo.version_modular.service.impl;

import com.zqy.demo.version_modular.entry.Version;
import com.zqy.demo.version_modular.mapper.VersionMapper;
import com.zqy.demo.version_modular.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gxt
 * @date 2020/5/6 16:21
 */
@Service
public class VersionServiceImpl implements VersionService {

    @Autowired
    private VersionMapper versionMapper;

    @Override
    public Version getNewVersion() {
        return versionMapper.getNewVersion();
    }
}
