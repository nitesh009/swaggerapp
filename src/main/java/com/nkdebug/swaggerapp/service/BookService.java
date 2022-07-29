package com.nkdebug.swaggerapp.service;


import com.nkdebug.swaggerapp.model.Book;
import com.nkdebug.swaggerapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String saveBook(Book book) {

        // validations before saving any data to DB..

        bookRepository.save(book);
        return "book save with id"+ book.getBookId();
    }

    public Book getBook(int bookId) {
        return bookRepository.findOne(bookId);
    }

    public List<Book> removeBook(int bookId) {
        bookRepository.delete(bookId);
        return bookRepository.findAll();
    }

}
