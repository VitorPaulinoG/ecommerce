package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
    Cart findFirstByCustomerId (UUID customerId);
}
