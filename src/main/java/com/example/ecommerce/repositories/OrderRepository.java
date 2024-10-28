package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
    List<Order> findByCartId (UUID cartId);

    List<Order> findByCartCustomerId (UUID customerId);

    List<Order> findByProductIdAndCartCustomerId (UUID productId, UUID customerId);

    List<Order> findByStatusAndCartCustomerId (String status, UUID customerId);
}
