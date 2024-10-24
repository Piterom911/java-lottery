package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void testCheckMatches() {
        int[] lotteryNumbers = {1, 2, 3, 4, 5};
        int[] userNumbers = {1, 6, 3, 8, 5};

        int matches = Utils.checkMatches(lotteryNumbers, userNumbers);

        assertEquals(3, matches);
    }

    @Test
    public void testCheckMatchesNoMatch() {
        int[] lotteryNumbers = {1, 2, 3, 4, 5};
        int[] userNumbers = {6, 7, 8, 9, 10};

        int matches = Utils.checkMatches(lotteryNumbers, userNumbers);

        assertEquals(0, matches);
    }

    @Test
    public void testCheckMatchesAllMatch() {
        int[] lotteryNumbers = {1, 2, 3, 4, 5};
        int[] userNumbers = {1, 2, 3, 4, 5};

        int matches = Utils.checkMatches(lotteryNumbers, userNumbers);

        assertEquals(5, matches);
    }
}
