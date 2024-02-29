package com.cis.batch33.library.model;

import lombok.Data;

import java.util.List;

@Data
public class MemberDTO {

    private int memberId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNumber;
    private String memberShipLevel;

    private AddressDTO address;
    private List<CheckoutDTO> checkouts;
}
