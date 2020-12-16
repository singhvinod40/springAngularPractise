package com.springPractise.service;

import com.springPractise.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookDaoService {

    //save book
    long save(Book book);

    //get singhle book
    Book get(long id);
    //get all books

    List<Book> list();

    //update record

    void update(long id, Book book);
    //delete a book

    void delete(long id);
}
