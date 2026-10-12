package com.example.rewards.controller;

import com.example.rewards.model.RewardResponse;
import com.example.rewards.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller to expose reward calculation endpoints.
 */
@RestController
@RequestMapping("/api/rewards")
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @GetMapping
    public ResponseEntity<List<RewardResponse>> calculateRewards() {
        List<RewardResponse> response = rewardService.getRewardsForAllCustomers();
        return ResponseEntity.ok(response);
    }
}