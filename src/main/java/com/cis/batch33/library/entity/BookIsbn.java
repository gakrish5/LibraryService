package com.cis.batch33.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="book_isbn")
@Data
public class BookIsbn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="isbn")
    private Long isbn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="book_id")
    private Book book;
}
