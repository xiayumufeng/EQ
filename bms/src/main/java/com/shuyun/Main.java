package com.shuyun;

import com.shuyun.bean.Book;
import com.shuyun.bean.Manager;
import com.shuyun.core.ChStr;
import com.shuyun.service.BookService;
import com.shuyun.service.ManagerService;
import org.springframework.context.ApplicationContext;

import java.sql.Date;
import java.util.List;

/**
 * Created by b on 2017/2/21.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext acx = Application.getApplicationContext();
        ManagerService managerLoginService = acx.getBean(ManagerService.class);
        List<Manager> managerList = managerLoginService.getManagerInfo();
        managerList.forEach(manager -> {
            System.out.println(manager.getId() + "+++++" + manager.getName() + "++++" + manager.getPwd());
        });

        /**
         * 测试登录验证
         */
        Manager m = new Manager();
        m.setName("小夏");
        m.setPwd("725");
        managerLoginService.validation(m);

        /**
         * 测试查询管理员权限
         */
        managerLoginService.queryPurview();


        /**
         * 测试增加新的管理员信息到数据库
         */
        Manager m1 = new Manager();
        m1.setName("小夏");
        m1.setPwd("725");
        managerLoginService.managerAdd(m1);

        /**
         * 测试管理员权限的修改
         */
        Manager m2 = new Manager();
        m2.setId(100);
        m2.setBookSet(1);
        m2.setReaderSet(1);
        m2.setSysSet(1);
        managerLoginService.purviewModify(m2);

        /**
         * 测试根据指定id删除管理员信息
         */

        managerLoginService.managerDel(3);

        /**
         * 修改指定id的管理员的密码
         */

        managerLoginService.pwdModify(12, "heheda");


        /**
         *测试查看图书信息列表
         */

        BookService bookService=acx.getBean(BookService.class);
        bookService.bookQuery();

        /**
         * 测试添加图书信息
         */

         Book book=new Book();
         book.setBarCode("123456");
         book.setBookName("hello world");
         book.setAuthor("jack");
         book.setTranslator("sum");
         book.setPrice(23.50f);
         book.setPage(78);
         book.setTypeName("计算机程序设计");
         book.setBookCaseName("测试系列");
         book.setPubName("中国电力出版社");
         book.setOperator("XIAOXIA");
         book.setStorage(88);
         book.setInTime(new java.util.Date());
         bookService.bookAdd(book);


        /**
         * 测试修改图书信息
         */
        Book book1=new Book();
        book1.setBarCode("123456");
        book1.setBookName("你好");
        book1.setAuthor("jack");
        book1.setTranslator("Sam");
        book1.setPrice(23.30f);
        book1.setPage(78);
        book1.setTypeName("计算机程序设计");
        book1.setBookCaseName("测试系列");
        book1.setPubName("中国电力出版社");
        book1.setOperator("XIAOXIA");
        book1.setStorage(66);
        book1.setInTime(new java.util.Date());
        bookService.bookModify(book1);


        /**
         * 测试删除图书信息
         */

        bookService.bookDel(book1);











    }
}
