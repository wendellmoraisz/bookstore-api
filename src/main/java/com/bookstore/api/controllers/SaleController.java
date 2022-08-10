package com.bookstore.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sale createSale(@RequestBody Sale sale){
        return saleRepository.save(sale);
    }
}
