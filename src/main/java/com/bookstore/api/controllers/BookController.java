package com.bookstore.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.api.models.Book;
import com.bookstore.api.repository.BookRepository;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    
    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

}
