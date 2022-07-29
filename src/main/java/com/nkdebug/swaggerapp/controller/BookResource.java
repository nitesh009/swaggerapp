package com.nkdebug.swaggerapp.controller;


import com.nkdebug.swaggerapp.model.Book;
import com.nkdebug.swaggerapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookResource {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public String saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/searchBook/{bookId}")
    public Book getBook(@PathVariable int bookId) {
        return bookService.getBook(bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public List<Book> deleteBook(@PathVariable int bookId) {
       return bookService.removeBook(bookId);
    }

}
