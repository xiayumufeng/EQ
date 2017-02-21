package com.shuyun.dataSource;

/**
 * Created by b on 2017/2/21.
 */
public class DatabaseContextHolder {
    private  static  final ThreadLocal<String> contextHolder=new ThreadLocal<String>();
    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }
}
