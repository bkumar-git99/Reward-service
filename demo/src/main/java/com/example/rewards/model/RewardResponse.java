package com.example.rewards.model;

import java.util.Map;

/**
 * Response model to encapsulate monthly rewards and total rewards per customer.
 */
public class RewardResponse {
    private Long customerId;
    private String customerName;
    private Map<String, Long> monthlyRewards;
    private Long totalRewards;

    public RewardResponse(Long customerId, String customerName, Map<String, Long> monthlyRewards, Long totalRewards) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.monthlyRewards = monthlyRewards;
        this.totalRewards = totalRewards;
    }

    // Getters and Setters
    public Long getCustomerId() { 
    	return customerId; 
    	}
    public String getCustomerName() {
    	return customerName; 
    	}
    public Map<String, Long> getMonthlyRewards() { 
    	return monthlyRewards; 
    	}
    public Long getTotalRewards() {
    	return totalRewards; 
    	}
}