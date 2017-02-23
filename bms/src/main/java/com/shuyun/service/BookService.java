package com.shuyun.service;

import com.shuyun.bean.Book;
import com.shuyun.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by b on 2017/2/23.
 */

@Service
public class BookService {

    @Resource
    private BookMapper bookMapper;

    /**
     * 查看图书信息列表
     */
    public void bookQuery() {
        List<Book> bookList = bookMapper.getBookInfo();
        bookList.forEach(book -> System.out.println(book.getBarCode() + "++++" + book.getBookName() + "++++" +
                book.getTypeName() + "++++" + book.getPubName() + "++++" + book.getBookCaseName() + "++++" + book.getStorage()));
    }


    /**
     * 添加图书信息
     *
     * @param book 待添加的图书对象
     */
    public void bookAdd(Book book) {
        List<Book> bookList = bookMapper.getBookInfo();
        boolean flag = false;
        for (Book book1 : bookList) {
            if (book.getBarCode().equals(book1.getBarCode())) {
                System.out.println("该图书信息已经添加！");
                flag = true;
            }
        }

        if (flag == false) {
            bookMapper.saveToBookInfo(book);
        }

    }


    /**
     * 修改图书信息
     *
     * @param book 待修改的图书对象
     */
    public void bookModify(Book book) {
        bookMapper.bookModify(book);
    }

    /**
     * 删除图书信息
     * @param book 待删除的图书对象
     */

    public void bookDel(Book book)
    {
        bookMapper.bookDel(book);
    }








}
