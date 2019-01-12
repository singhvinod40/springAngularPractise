package com.springPractise.controller;

import com.springPractise.model.Book;
import com.springPractise.service.BookDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDaoService bookDaoService;

    //get all the book
    @GetMapping("/api/allbooks")
    public ResponseEntity<List<Book>> list() {

        List<Book> list = bookDaoService.list();
        return ResponseEntity.ok().body(list);
    }

}
