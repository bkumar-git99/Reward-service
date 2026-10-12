package com.example.rewards.repository;

import com.example.rewards.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Customer entity database operations.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}