package com.cis.batch33.library.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CheckoutDTO {
    private int id;
    private long isbn;
    private int memberId;
    private LocalDateTime checkoutDate;
    private LocalDateTime dueDate;
    private boolean isReturned;
}