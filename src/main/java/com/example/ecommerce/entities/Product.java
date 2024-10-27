package com.example.ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private UUID id;
    private String name;
    private String description;
    private int amountInStock;
    private double unitPrice;
    private Seller seller;
    private Store store;
}
