package com.example.demo.service.Impl;

import com.example.demo.common.utils.JsonUtil;
import com.example.demo.dao.BookMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public User selectByPrimaryKey(String name, String password) {
        List<User> users = userMapper.selectByName(name);
        if (users != null) {
            if (users.get(0).getPassword().equals(password)) {
                return users.get(0);
            }

        }
        return null;
    }

    @Override
    public List<Book> allBooks() {
        return bookMapper.findAll();
    }

    @Override
    public int addBooks(Book book) {
        int row = bookMapper.insert(book);
        return row;
    }

    @Override
    public Book selectBooksById(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modifyBooks(Book book) {
        System.out.println(bookMapper.updateByPrimaryKeySelective(book));
        return bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public int delThis(int id) {
        return bookMapper.deleteByPrimaryKey(id);
    }
}
