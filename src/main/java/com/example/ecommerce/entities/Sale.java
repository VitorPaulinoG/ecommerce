package com.example.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_Sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false, foreignKey = @ForeignKey(name = "fk_sale_customer"))
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "orderId", nullable = false, foreignKey = @ForeignKey(name = "fk_sale_orderId"))
    private Order order;

    @Column(name = "unitPrice", nullable = false, columnDefinition = "decimal(15,2)")
    private BigDecimal unitPrice;

    @Column(name = "amount", nullable = false, columnDefinition = "int")
    private int amount;

    @Column(name = "totalPrice", nullable = false, columnDefinition = "decimal(15,2)")
    private BigDecimal totalPrice;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate date;

    @Column(name = "status", nullable = false, columnDefinition = "varchar(255)")
    private String status;
}
