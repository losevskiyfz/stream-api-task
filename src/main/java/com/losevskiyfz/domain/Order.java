package com.losevskiyfz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private Long id;
    private String name;
    private String description;
    private Integer price;
}