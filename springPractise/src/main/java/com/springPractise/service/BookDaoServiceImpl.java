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

    @Transactional
    public List<Book> list() {
        return bookDao.list();
    }

    @Transactional
    public long save(Book book) {
        return bookDao.save(book);
    }

    @Transactional
    public Book get(long id) {

        return bookDao.get(id);
    }
    @Transactional
    public void update(long id, Book book) {
        bookDao.update(id, book);
    }

    @Transactional
    public void delete(long id) {
        bookDao.delete(id);

    }
}
