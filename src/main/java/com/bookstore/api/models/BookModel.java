package com.bookstore.api.models;

// import java.util.ArrayList;
// import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class BookModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @OneToMany
    // private List<BookPurchase> purchases = new ArrayList<BookPurchase>();

    private String title;
    private String author;
    private String publishingCompany;
    private String bookImgSrc;
    private Integer publicationYear;
}
