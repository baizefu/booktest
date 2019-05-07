package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.User;

import java.util.List;

public interface IndexService {

    User selectByPrimaryKey(String name, String password);

    List<Book> allBooks();

    int addBooks(Book book);

    Book selectBooksById(int id);

    int delThis(int id);

    int modifyBooks(Book book);
}
