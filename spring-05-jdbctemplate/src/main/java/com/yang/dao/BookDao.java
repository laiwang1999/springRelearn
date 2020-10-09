package com.yang.dao;

import com.yang.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void deleteBook(Integer id);

    int findCount();

    Book findOne(int id);
    List<Book> findBookList();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
