package com.losevskiyfz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {
    private Long id;
    private String country;
    private String city;
    private String street;
    private String house;
    private String index;
}