package com.shuyun.bean;

import lombok.*;
import org.apache.ibatis.annotations.ConstructorArgs;

/**
 * Created by b on 2017/2/21.
 */

@Getter
@Setter

public class Manager {
    /**
     * 管理员ID号
     */
    private Integer id = new Integer("-1");

    /**
     * 管理员姓名
     */
    private String name = "";
    /**
     * 管理员密码
     */
    private String pwd = "";

    /**
     * 系统设置权限
     */
    private int sysSet = 0;
    /**
     * 读者管理权限
     */
    private int readerSet = 0;
    /**
     * 图书管理权限
     */
    private int bookSet = 0;
    /**
     * 图书借还权限
     */
    private int borrowBack = 0;
    /**
     * 系统查询权限
     */
    private int sysQuery = 0;

    /**
     * 测试登录验证
     * @param name 登录管理员姓名
     * @param pwd 登录密码
     */


}
