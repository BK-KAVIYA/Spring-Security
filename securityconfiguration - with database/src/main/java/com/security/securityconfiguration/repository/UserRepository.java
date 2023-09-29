package com.security.securityconfiguration.repository;


import com.security.securityconfiguration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods here if needed.

    User findByUsername(String username); // Example method to find a user by username
}
