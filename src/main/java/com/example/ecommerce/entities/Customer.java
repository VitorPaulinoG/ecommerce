package com.example.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_Customer")
public class Customer extends User {
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "addressId", nullable = false, foreignKey = @ForeignKey(name = "fk_customer_address"))
    private Address address;
}
