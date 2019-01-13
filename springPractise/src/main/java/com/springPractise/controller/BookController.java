package com.springPractise.controller;

import com.springPractise.model.Book;
import com.springPractise.service.BookDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDaoService bookDaoService;

    //get all the book
    @GetMapping("/api/books")
    public ResponseEntity<List<Book>> list() {
        List<Book> list = bookDaoService.list();
        return ResponseEntity.ok().body(list);
    }

    //save the book
    @PostMapping("api/books")
    public ResponseEntity<?> save(@RequestBody Book book) {
        long id = bookDaoService.save(book);
        return ResponseEntity.ok("book saved with following id" + id);

    }
    //get single book

    @GetMapping("api/books/{id}")
    public ResponseEntity<Book> getbook(@PathVariable("id") long id) {
        Book book = bookDaoService.get(id);
        return ResponseEntity.ok().body(book);
    }

    //update record
    @PutMapping("api/books/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book) {

        bookDaoService.update(id, book);
        return ResponseEntity.ok().body("Book has been udated");
    }

    @DeleteMapping("api/books/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        bookDaoService.delete(id);
        return ResponseEntity.ok().body("book has been deleted sussesfully");
    }


}
