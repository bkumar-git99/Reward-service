package com.example.rewards.test;

import org.junit.jupiter.api.Test;

import com.example.rewards.service.RewardService;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for reward calculation logic.
 */
public class RewardServiceTest {

    private final RewardService rewardService = new RewardService();

    @Test
    public void testCalculatePointsAbove100() {
        // $120 -> 2*(20) + 1*(50) = 90 points
        assertEquals(90, rewardService.calculatePoints(120));
    }

    @Test
    public void testCalculatePointsBetween50And100() {
        // $80 -> 1*(30) = 30 points
        assertEquals(30, rewardService.calculatePoints(80));
    }

    @Test
    public void testCalculatePointsBelow50() {
        // $40 -> 0 points
        assertEquals(0, rewardService.calculatePoints(40));
    }
}