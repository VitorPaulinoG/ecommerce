package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface SaleRepository extends JpaRepository<Sale, UUID> {
    List<Sale> findByCustomerId (UUID customerId);

    Sale findFirstByOrderId (UUID orderId);

    List<Sale> findByDate (LocalDate date);

    List<Sale> findByDateBefore (LocalDate date);

    List<Sale> findByDateAfter (LocalDate date);

    List<Sale> findByStatus (String status);

}
