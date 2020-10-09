package com.yang.service;

import com.yang.dao.BookDao;
import com.yang.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    //注入Dao
    @Autowired
    private BookDao bookDao;

    public void add(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(int id) {
        bookDao.deleteBook(id);
    }

    public int findCount() {
        return bookDao.findCount();
    }

    public Book findOne(int id) {
        Book one = bookDao.findOne(id);
        return one;
    }

    public List<Book> queryAll() {
        List<Book> bookList = bookDao.findBookList();
        return bookList;
    }

    public void batchAddBook(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdate(batchArgs);
    }
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
