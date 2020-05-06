package com.zqy.demo.user_modular.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 971
 * @date 2020/4/28 16:53
 */
@Data
@TableName("tm_user")
public class User implements Serializable {

    @TableId(value = "",type = IdType.ID_WORKER)
    private Long userId;

    @TableField("username")
    private String username;    //用户名

    @TableField("password")
    private String password;    //密码

    @TableField("user_create_date")
    private String userCreateDate;    //创建时间

    @TableField("user_role_Id")
    private Long userRoleId;    //用户对应的角色ID

    @TableField(exist = false)
    private String role;    //角色

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userCreateDate='" + userCreateDate + '\'' +
                ", userRoleId=" + userRoleId +
                ", role='" + role + '\'' +
                '}';
    }
}
