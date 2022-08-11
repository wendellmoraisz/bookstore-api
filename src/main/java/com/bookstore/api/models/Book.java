package com.bookstore.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.List;
import lombok.Data;

@Data
@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String publishingCompany;
    private String bookImgSrc;
    private Integer publicationYear;

    @OneToMany
    private List<BookPurchase> purchases;
    
    @ManyToMany
    private List<Sale> sales;
}
