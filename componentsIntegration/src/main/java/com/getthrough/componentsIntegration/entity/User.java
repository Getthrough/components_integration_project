package com.getthrough.componentsIntegration.entity;

import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * User 实体对象
 *
 * @author getthrough
 * @date 2019/12/8
 */
@Data
@TableName("user")
public class User {

    @TableId
    private Long id;
    private String name;
    @TableField(select = false)
    private Integer age;
    private String email;
}
