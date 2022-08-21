package com.bookstore.api.models;

// import lombok.Data;

public class Book {

    public String title;
    public String author;
    public String publishingCompany;
    public String bookImgSrc;
    public Integer publicationYear;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublishingCompany() {
        return publishingCompany;
    }
    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }
    public String getBookImgSrc() {
        return bookImgSrc;
    }
    public void setBookImgSrc(String bookImgSrc) {
        this.bookImgSrc = bookImgSrc;
    }
    public Integer getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

}
