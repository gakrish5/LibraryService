package com.cis.batch33.library.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BookIsbnDTO {
    private long isbn;
    private int bookId;
    private List<CheckoutDTO> checkouts;
}