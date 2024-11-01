package com.example.ecommerce.entities;

import jakarta.persistence.*;
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
@Entity
@Table(name = "tb_Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "cartId", nullable = false, foreignKey = @ForeignKey(name = "fk_order_cart"))
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false, foreignKey = @ForeignKey(name = "fk_order_product"))
    private Product product;

    @Column(name = "amount", nullable = false, columnDefinition = "int")
    private int amount;

    @Column(name = "totalPrice", nullable = false, columnDefinition = "decimal(15,2)")
    private BigDecimal totalPrice;

    @Column(name = "status", nullable = false, columnDefinition = "varchar(255)")
    private String status;

    public void setAmount(int amount){
        this.amount = amount;
        updateTotalPrice();
    }

    private void updateTotalPrice() {
        this.totalPrice = this.product.getUnitPrice().multiply(BigDecimal.valueOf(this.amount));
    }
}
