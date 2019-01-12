package com.springPractise.service;

import com.springPractise.dao.BookDao;
import com.springPractise.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookDaoServiceImpl implements BookDaoService {
    @Autowired
    private BookDao bookDao;

    public long save(Book book) {
        return 0;
    }

    public Book get(long id) {
        return null;
    }

    @Transactional
    public List<Book> list() {
        return bookDao.list();
    }

    public Book update(long id, Book book) {
        return null;
    }

    public Book delete(long id) {
        return null;
    }
}
