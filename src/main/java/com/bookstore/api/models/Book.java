package com.bookstore.api.models;

import lombok.Data;

@Data
public class Book {

    public String title;
    public String author;
    public String publishingCompany;
    public String bookImgSrc;
    public Integer publicationYear;

}
