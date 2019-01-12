package com.springPractise.dao;

import com.springPractise.model.Book;

import java.util.List;

public interface BookDao {
    //inetrface for dao class

    //save book
    long save(Book book);

    //get singhle book
    Book get(long id);
    //get all books

    List<Book> list();

    //update record

    Book update(long id, Book book);
    //delete a book

    Book delete(long id);
}
