package com.example.rewards.service;

import com.example.rewards.model.Customer;
import com.example.rewards.model.RewardResponse;
import com.example.rewards.model.Transaction;
import com.example.rewards.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service class to calculate reward points based on purchase amount.
 */
@Service
public class RewardService {

    @Autowired
    private CustomerRepository customerRepository;

    public long calculatePoints(double amount) {
        long points = 0;
        if (amount > 100) {
            points += (long) ((amount - 100) * 2);
            amount = 100;
        }
        if (amount > 50) {
            points += (long) (amount - 50);
        }
        return points;
    }

public List<RewardResponse> getRewardsForAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        if (customers == null || customers.isEmpty()) {
            return new java.util.ArrayList<>();
        }

        return customers.stream().map(customer -> {
            Map<String, Long> monthlyRewards = new HashMap<>();
            long totalRewards = 0;

            if (customer.getTransactions() != null) {
                for (com.example.rewards.model.Transaction tx : customer.getTransactions()) {
                    if (tx != null && tx.getTransactionDate() != null) {
                        String month = tx.getTransactionDate().getMonth().toString();
                        long points = calculatePoints(tx.getAmount());
                        monthlyRewards.put(month, monthlyRewards.getOrDefault(month, 0L) + points);
                        totalRewards += points;
                    }
                }
            }

            return new RewardResponse(customer.getId(), customer.getName(), monthlyRewards, totalRewards);
        }).collect(Collectors.toList());
    }
}