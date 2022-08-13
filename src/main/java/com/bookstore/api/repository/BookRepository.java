package com.bookstore.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.api.models.BookModel;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Long>{
    
}
