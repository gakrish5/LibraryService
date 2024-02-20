package com.cis.batch33.library.model;

public class Book {
    private long bookId;
    private String author;
    private String publisher;
    private int yearOfPublish;
    private int isbn;


    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public long getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getIsbn() {
        return isbn;
    }
}