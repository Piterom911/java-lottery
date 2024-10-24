package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class LotteryTest {

    @Test
    public void testLotteryNumbersSize() {
        Lottery lottery = new Lottery();
        int[] lotteryNumbers = lottery.getLotteryNumbers();

        assertEquals(Constants.COUNT_SET_SIZE, lotteryNumbers.length);
    }

    @Test
    public void testLotteryNumbersUnique() {
        Lottery lottery = new Lottery();
        int[] lotteryNumbers = lottery.getLotteryNumbers();

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : lotteryNumbers) {
            uniqueNumbers.add(number);
        }
        assertEquals(Constants.COUNT_SET_SIZE, uniqueNumbers.size());
    }

    @Test
    public void testLotteryNumbersInRange() {
        Lottery lottery = new Lottery();
        int[] lotteryNumbers = lottery.getLotteryNumbers();

        for (int number : lotteryNumbers) {
            assertTrue(number >= 1 && number <= Constants.MAX_NUMBER);
        }
    }
}
