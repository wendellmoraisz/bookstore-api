package com.bookstore.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.api.models.BookPurchase;

@Repository
public interface PurchaseRepository extends JpaRepository<BookPurchase, Long>{
    
}
