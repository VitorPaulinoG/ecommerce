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
@Table(name = "tb_Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(500)")
    private String name;

    @Column(name = "description", nullable = true, columnDefinition = "varchar(1000)")
    private String description;

    @Column(name = "amountInStock", nullable = false, columnDefinition = "int default(0)")
    private int amountInStock;

    @Column(name = "unitPrice", nullable = false, columnDefinition = "decimal(15,2)")
    private BigDecimal unitPrice;

    @ManyToOne
    @JoinColumn(name = "sellerId", nullable = false, foreignKey = @ForeignKey(name = "fk_product_seller"))
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "storeId", nullable = false, foreignKey = @ForeignKey(name = "fk_product_store"))
    private Store store;
}
