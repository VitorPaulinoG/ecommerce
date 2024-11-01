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
@Table(name = "tb_Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "cep", nullable = true, columnDefinition = "char(8)")
    private String cep;

    @Column(name = "street", nullable = false, columnDefinition = "varchar(500)")
    private String street;

    @Column(name = "number", nullable = false, columnDefinition = "int")
    private int number;

    @Column(name = "complement", nullable = false, columnDefinition = "varchar(50)")
    private String complement;

    @Column(name = "city", nullable = false, columnDefinition = "varchar(255)")
    private String city;

    @Column(name = "state", nullable = false, columnDefinition = "varchar(500)")
    private String state;

    @Column(name = "country", nullable = false, columnDefinition = "varchar(500)")
    private String country;
}
