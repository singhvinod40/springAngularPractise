package com.springPractise.dao;

import com.springPractise.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    public long save(Book book) {
        return 0;
    }

    public Book get(long id) {
        return null;
    }

    public List<Book> list() {
        List<Book> list = sessionFactory.getCurrentSession().createQuery("FROM BOOK").list();

        return list;
    }

    public Book update(long id, Book book) {
        return null;
    }

    public Book delete(long id) {
        return null;
    }
}
