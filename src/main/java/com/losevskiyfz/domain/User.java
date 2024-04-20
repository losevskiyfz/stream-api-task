package com.losevskiyfz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Address> deliveryAddresses;
    private List<Order> orders;
}