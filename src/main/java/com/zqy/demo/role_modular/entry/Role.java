package com.zqy.demo.role_modular.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Value;

/**
 * @author 971
 * @date 2020/4/29 9:35
 */
@Data
@TableName("tm_role")
public class Role {

    @TableId(value = "role_id",type = IdType.ID_WORKER)
    private Long roleId;

    @TableField("role_name")
    private String roleName;

    @TableField("role_information")
    private String roleInformation;

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleInformation='" + roleInformation + '\'' +
                '}';
    }
}
