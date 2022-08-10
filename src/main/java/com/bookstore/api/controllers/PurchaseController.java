package com.bookstore.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.bookstore.api.models.BookPurchase;
import com.bookstore.api.repository.PurchaseRepository;

@RestController
@RequestMapping("/compras")
public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping
    public List<BookPurchase> getPurchase() {
        return purchaseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookPurchase createPurchase(@RequestBody BookPurchase bookPurchase){
        return purchaseRepository.save(bookPurchase);
    }
}
