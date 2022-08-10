package com.bookstore.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.api.models.Sale;
import com.bookstore.api.repository.SaleRepository;


@RestController
@RequestMapping("/vendas")
public class SaleController {
    
    @Autowired
    private SaleRepository saleRepository;

    @GetMapping
    public List<Sale> getSales(){
        return saleRepository.findAll();
    }
}
