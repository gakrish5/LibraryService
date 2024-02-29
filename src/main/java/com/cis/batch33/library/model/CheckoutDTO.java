package com.cis.batch33.library.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CheckoutDTO {
    private Integer id;
    private Long isbn;
    private LocalDateTime checkoutDate;
    private LocalDateTime dueDate;
    private boolean isReturned;
}