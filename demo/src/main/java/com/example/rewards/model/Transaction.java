package com.example.rewards.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Transaction entity to store purchase details and transaction date.
 */
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    
    private LocalDate transactionDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Getters and Setters
    public Long getId() { 
    	return id; 
    	}
    public void setId(Long id) {
    	this.id = id; 
    	}
    public double getAmount() { 
    	return amount; 
    	}
    public void setAmount(double amount) {
    	this.amount = amount; 
    	}
    public LocalDate getTransactionDate() {
    	return transactionDate; 
    	}
    public void setTransactionDate(LocalDate transactionDate) {
    	this.transactionDate = transactionDate; 
    	}
    public Customer getCustomer() { 
    	return customer; 
    	}
    public void setCustomer(Customer customer) {
    	this.customer = customer; 
    	}
}