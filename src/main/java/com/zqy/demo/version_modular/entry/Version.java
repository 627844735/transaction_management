package com.zqy.demo.version_modular.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 971
 * @date 2020/5/6 16:16
 */
@Data
@TableName("tm_version")
public class Version {

    @TableId(value = "version_id",type = IdType.ID_WORKER)
    private Long versionId;

    @TableField("number")
    private String number;      //版本号

    @TableField("info")
    private String info;        //版本信息

    @TableField("name")
    private String name;        //制作人

    @TableField("release_time")
    private String releaseTime;     //更新时间

    @Override
    public String toString() {
        return "Version{" +
                "versionId=" + versionId +
                ", number='" + number + '\'' +
                ", info='" + info + '\'' +
                ", name='" + name + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                '}';
    }
}
