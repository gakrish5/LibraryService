package com.cis.batch33.library.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Table(name="library_member")
@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_id")
    private Integer memberId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_address")
    private String emailAddress;

    @Column(name="phone_number")
    private Long phoneNumber;

    @Column(name="membership_level")
    private String memberShipLevel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Checkout> checkouts;

    // lombok
}