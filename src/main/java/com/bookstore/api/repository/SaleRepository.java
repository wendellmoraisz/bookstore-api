package com.bookstore.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.api.models.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
