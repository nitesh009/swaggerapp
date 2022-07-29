package com.nkdebug.swaggerapp.repository;

import com.nkdebug.swaggerapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
