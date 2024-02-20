package com.cis.batch33.library.service;

import com.cis.batch33.library.model.Book;
import com.cis.batch33.library.model.Member;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class BookService {
    private Map<Long, Book> bookMap = new HashMap<>();

    public Book createBook(Book book){

        // call the database
        Long bookId = new Random().nextLong();
        book.setBookId(bookId);
        bookMap.put(bookId, book);
        return  book;
    }

    public Book getBook(Long bookId) {
        return bookMap.get(bookId);

    }

    public Book updateBook(Book book) {
        Long bookId = book.getBookId();
        bookMap.put(bookId, book);
        return book;
    }

    public void deleteBook(Long bookId) {
        bookMap.remove(bookId);
    }
}