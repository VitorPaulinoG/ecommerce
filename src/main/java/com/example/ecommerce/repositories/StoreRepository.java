package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface StoreRepository extends JpaRepository<Store, UUID> {
     Store findFirstByName (String name);

     List<Store> findByNameContaining (String name);
}
