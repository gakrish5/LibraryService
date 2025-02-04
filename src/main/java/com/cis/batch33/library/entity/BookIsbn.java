package com.cis.batch33.library.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="book_isbn")
@Data
public class BookIsbn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long isbn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="book_id")
    private Book book;

    @OneToMany(mappedBy = "bookIsbn")
    private List<Checkout> checkouts;
}
