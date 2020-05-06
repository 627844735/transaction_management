package com.zqy.demo.version_modular.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zqy.demo.version_modular.entry.Version;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gxt
 * @date 2020/5/6 16:20
 */
@Mapper
public interface VersionMapper extends BaseMapper<Version> {

    Version getNewVersion();
}
