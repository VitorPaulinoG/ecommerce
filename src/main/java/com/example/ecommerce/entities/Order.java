package com.example.ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    private UUID id;
    private Cart cart;
    private Product product;
    private int amount;
    private double totalPrice;
    private String status;

    public void setAmount(int amount){
        this.amount = amount;
        updateTotalPrice();
    }

    private void updateTotalPrice() {
        this.totalPrice = this.product.getUnitPrice() * this.amount;
    }
}
