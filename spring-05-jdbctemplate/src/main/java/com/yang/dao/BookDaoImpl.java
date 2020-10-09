package com.yang.dao;

import com.yang.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    //注入JDBCTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Book book) {
//        1.创建sql语句
        String sql = "insert into mybatis.book values(?,?,?)";
//        2.调用方法实现
        Object[] args = {book.getId(), book.getName(), book.getPwd()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    public void updateBook(Book book) {
        String sql = "update mybatis.book set name=?,pwd=? where id=?";
        Object[] args = {book.getName(), book.getPwd(), book.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    public void deleteBook(Integer id) {
        String sql = "delete from mybatis.book where id = ?";
        Object[] args = {id};
        int delete = jdbcTemplate.update(sql, args);
        System.out.println(delete);
    }

    public int findCount() {
        String sql = "select count(*) from mybatis.book";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    public Book findOne(int id) {
        String sql = "select * from mybatis.book where id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    public List<Book> findBookList() {
        String sql = "select * from mybatis.book;";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into mybatis.book values (?,?,?)";
        int[] res = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(res));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update mybatis.book set name=?,pwd=? where id=?";
        int[] res = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(res));
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from mybatis.book where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

}
