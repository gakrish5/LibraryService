package com.cis.batch33.library.service;

import com.cis.batch33.library.entity.Book;
import com.cis.batch33.library.entity.BookIsbn;
import com.cis.batch33.library.model.BookDTO;
import com.cis.batch33.library.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ModelMapper modelMapper;

    public BookDTO getBook(int bookId) {
        Book book =  bookRepository.findById(bookId).orElseThrow(() -> new IllegalArgumentException());
        return  modelMapper.map(book, BookDTO.class);
    }

    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(b -> {
            return modelMapper.map(b, BookDTO.class);
        }).collect(Collectors.toList());
    }

    public BookDTO createBook(BookDTO bookDTO){

        Book b = modelMapper.map(bookDTO, Book.class);
        // generating and adding multiple ISBNs
        List<BookIsbn> bookIsbns = new ArrayList<>(b.getQuantity());
        for (int i = 0; i < b.getQuantity(); i++) {
            BookIsbn bk = new BookIsbn();
            bk.setBook(b);
            bookIsbns.add(bk);
        }

        // Set the list of ISBNs to the LibraryBook
        b.setBookIsbns(bookIsbns);

        // Save the LibraryBook (and cascadingly, the BookIsbn(s)) to the database
        Book lbr = bookRepository.save(b);

        // Update the original book object with the generated bookId
        bookDTO.setBookId(lbr.getBookId());

        return modelMapper.map(lbr, BookDTO.class);
    }

    public BookDTO updateBook(int bookId, BookDTO updatedBook) {
        // Retrieve the existing LibraryBook from the database
        Book existingBook = bookRepository.findById(updatedBook.getBookId())
                .orElseThrow(() -> new EntityNotFoundException("Book not found"));

        // Use ModelMapper to map fields, except for quantity and ISBNs
        modelMapper.map(updatedBook, existingBook);

        int newQuantity = updatedBook.getQuantity();
        int currentQuantity = existingBook.getQuantity();

        // Adjust ISBN records based on the change in quantity
        if (newQuantity > currentQuantity) {
            // Increase ISBN records
            List<BookIsbn> bookIsbns = new ArrayList<>();
            for (int i = 0; i < newQuantity - currentQuantity; i++) {
                BookIsbn newIsbn = new BookIsbn();
                newIsbn.setBook(existingBook);
                existingBook.getBookIsbns().add(newIsbn);
            }
        } else if (newQuantity < currentQuantity) {
            // Decrease ISBN records
            int recordsToRemove = currentQuantity - newQuantity;
            List<BookIsbn> isbnsToRemove = existingBook.getBookIsbns().subList(0, recordsToRemove);
            existingBook.getBookIsbns().removeAll(isbnsToRemove);
        }

        // Update the quantity
        existingBook = bookRepository.save(existingBook);
        modelMapper.map(existingBook, updatedBook);

        return updatedBook;
    }

    public void deleteBook(int bookId) {
        Book book =  bookRepository.findById(bookId).orElseThrow(IllegalArgumentException::new);
        bookRepository.deleteById(bookId);
    }
}