package com.cis.batch33.library.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="checkout")
@Data
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long isbn;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    private LocalDateTime checkoutDate;
    private LocalDateTime dueDate;
    private boolean isReturned;
}