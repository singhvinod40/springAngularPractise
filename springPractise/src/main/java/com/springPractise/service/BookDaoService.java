package com.springPractise.service;

import com.springPractise.model.Book;

import java.util.List;

public interface BookDaoService {

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
