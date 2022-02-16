package com.woc.service;


import com.woc.dao.BookMapper;
import com.woc.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService{
    //service调dao层，组合Dao
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public List<Books> queryBook(String bookName) {
        return bookMapper.queryBook(bookName);
    }
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
