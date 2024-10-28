package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SellerRepository extends JpaRepository<Seller, UUID> {
    List<Seller> findByStoreId(UUID storeId);
}
