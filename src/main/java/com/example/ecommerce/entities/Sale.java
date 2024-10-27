package com.example.ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sale {
    private UUID id;
    private Customer customer;
    private Order order;
    private double unitPrice;
    private double amount;
    private LocalDate date;
    private String status;
}
