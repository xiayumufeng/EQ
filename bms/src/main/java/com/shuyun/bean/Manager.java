package com.shuyun.bean;

import lombok.*;

/**
 * Created by b on 2017/2/21.
 */

@Getter
@Setter
public class Manager {
    /**
     * 管理员ID号
     */
    private  Integer id =new Integer("-1");

    /**
     * 管理员姓名
     */
    private  String name="";
    /**
     * 管理员密码
     */
    private String pwd="";

    /**
     *系统设置权限
     */
    private int sysset=0;
    /**
     * 读者管理权限
     */
    private int readerset=0;
    /**
     * 图书管理权限
     */
    private  int bookset=0;
    /**
     * 图书借还权限
     */
    private int borrowback=0;
    /**
     * 系统查询权限
     */
    private int sysquery=0;


}
