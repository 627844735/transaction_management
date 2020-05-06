package com.zqy.demo.role_modular.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.zqy.demo.role_modular.entry.Role;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @author 971
 * @date 2020/4/29 9:38
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    String findByRoleId(Long roleId);
}
