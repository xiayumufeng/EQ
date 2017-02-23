package com.shuyun.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by b on 2017/2/23.
 */
@Getter
@Setter
public class Book {
    /**
     * 条形码
     */
    private String barCode;

    /**
     * 书名
     */
    private String bookName;


    /**
     *作者
     */
    private String author ;

    /**
     * 译者
     */
     private  String translator;

    /**
     * 价格
     */
    private float price;


    /**
     * 页数
     */
    private int page;

    /**
     * 类型ID
     */

    private int typeID;

    /**
     * 类型名称
     */
    private  String typeName;

    /**
     * 入库时间
     */
    private Date inTime;

    /**
     * ISBN
     */

    private  String isbn;


    /**
     * 出版社名称
     */
    private String pubName;

    /**
     * 书架名称
     */
    private  String bookCaseName;

    /**
     * 书籍类型ID
     */

    private int bookCaseID;


    /**
     *入库人员
     */
    private String operator;



    /**
     * 库存量
     */
    private  int storage;








}
