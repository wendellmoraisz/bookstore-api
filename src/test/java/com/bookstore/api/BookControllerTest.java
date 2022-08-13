package com.bookstore.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bookstore.api.controllers.BookController;
import com.bookstore.api.models.Book;
import com.bookstore.api.models.BookModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    public void getBooksTest() {
        assertEquals(new ArrayList<BookModel>(), bookController.getBooks());
    }

    @Test
    public void createBookTest() {
        Book book = new BookModel();
        assertEquals(book, bookController.createBook(new BookModel()));
    }
}
