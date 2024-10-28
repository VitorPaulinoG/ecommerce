package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findFirstByEmail (String email);
}
