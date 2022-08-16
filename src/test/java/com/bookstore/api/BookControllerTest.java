package com.bookstore.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bookstore.api.controllers.BookController;
import com.bookstore.api.models.BookModel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        BookModel registeredBook = bookController.createBook(new BookModel());
        assertTrue(bookController.getBooks().contains(registeredBook));
    }

    @Test
    public void createBookTest() {
        BookModel bookModel = new BookModel();
        BookModel bookResponse = bookController.createBook(new BookModel());
        assertEquals(bookModel.getClass().getSimpleName(), bookResponse.getClass().getSimpleName());
    }
}
