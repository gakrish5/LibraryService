package com.cis.batch33.library.controller;

import com.cis.batch33.library.model.BookDTO;
import com.cis.batch33.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/{bookId}")
    public BookDTO getBook(@PathVariable int bookId){
        return bookService.getBook(bookId);
    }

    @GetMapping
    public List<BookDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    // create a book
    @PostMapping
    public BookDTO createBook(@RequestBody BookDTO bookDTO){
        return bookService.createBook(bookDTO);
    }

    @PutMapping("/{bookId}")
    public BookDTO updateBook(@PathVariable int bookId, @RequestBody BookDTO updatedBook){
        // Set the memberId for the member object to be updated
        return bookService.updateBook(bookId, updatedBook);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable int bookId){
        bookService.deleteBook(bookId);
    }

}