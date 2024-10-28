package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findByStoreId(UUID storeId);

    List<Product> findBySellerId(UUID sellerId);

    List<Product> findByNameLikeAndStoreId(String name, UUID storeId);

    List<Product> findByDescriptionLikeAndStoreId(String description, UUID storeId);
}
