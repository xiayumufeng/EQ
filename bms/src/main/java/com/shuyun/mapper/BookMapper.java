package com.shuyun.mapper;

import com.shuyun.bean.Book;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by b on 2017/2/23.
 */
@Component
public interface BookMapper {
    public List<Book> getBookInfo();
    public void saveToBookInfo(Book book);
    public void bookModify(Book book);
    public void bookDel(Book book);

}
