package com.springPractise.dao;

import com.springPractise.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    public long save(Book book) {
        sessionFactory.getCurrentSession().save(book);
        return book.getId();
    }

    public Book get(long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    public List<Book> list() {
        try {
            List list = sessionFactory.getCurrentSession().createQuery("FROM book").list();
            return list;
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return list();
    }

    public void update(long id, Book book) {
        Session session = sessionFactory.getCurrentSession();
        Book oldBok = session.byId(Book.class).load(id);
        oldBok.setBookName(book.getBookName());
        oldBok.setAuthor(book.getAuthor());
        session.flush();
    }

    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.byId(Book.class).load(id);
        session.delete(book);
    }
}
