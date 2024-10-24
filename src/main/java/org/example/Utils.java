package org.example;

import java.util.Arrays;

public class Utils {
    public static int checkMatches(int[] lotteryNumbers, int[] userNumbers) {
        int matches = 0;
        for (int userNumber : userNumbers) {
            if (Arrays.stream(lotteryNumbers).anyMatch(num -> num == userNumber)) {
                matches++;
            }
        }
        return matches;
    }
}

