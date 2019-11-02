package com.dmsdbj.team.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunshine
 * @since 2019-11-01
 */
@Data
@EqualsAndHashCode(callSuper = false)

//@Accessors 注解用来配置lombok如何产生和显示getters和setters的方法。
//chain为一个布尔值，如果为true生成的set方法返回this，为false生成的set方法是void类型。默认为false，除非当fluent为true时，chain默认则为true
@Accessors(chain = true)
@TableName(autoResultMap = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    private String phone;

    @TableField("userEvaluation")
    private String userEvaluation;

    @TableLogic
    private Integer deleted=0;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    @Column(name = "create_time")
    private Date createTime;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "update_time")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


    @TableField(typeHandler = FastjsonTypeHandler.class)
    private OtherInfo otherInfo;

}
