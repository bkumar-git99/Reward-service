package com.example.rewards.model;

import jakarta.persistence.*;

import java.util.List;

/**
 * Customer entity class to represent customer details.
 */
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    // Getters and Setters
    public Long getId() 
    { 
    	return id; 
    	}
    public void setId(Long id) {
    	this.id = id; 
    	}
    public String getName() {
    	return name; 
    	}
    public void setName(String name) {
    	this.name = name;
    	}
    public List<Transaction> getTransactions() {
    	return transactions; 
    	}
    public void setTransactions(List<Transaction> transactions) { 
    	this.transactions = transactions; 
    	}
}