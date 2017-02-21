package com.shuyun.core;

import java.io.UnsupportedEncodingException;

/**
 * Created by b on 2017/2/21.
 * 字符串处理类
 */

/**
 * 解决中文乱码问题的方法
 */
public class ChStr {
    public static String toChinese(String strvalue) {
        try {
            if (strvalue == null)
                return "";
            else {

                strvalue = new String(strvalue.getBytes("ISO8859_1"), "GBK").trim();
                return strvalue;

            }
        } catch (UnsupportedEncodingException e) {
            return "";
        }

    }



/**
 * 处理字符串中的空值的方法
 */

public static final String nullToString(String v,String toV)
{
    if(v==null||"".equals(v))
    {
        v=toV;
    }
    return v;

}






}












