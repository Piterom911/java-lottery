package org.example;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class Lottery {
    private final int[] lotteryNumbers = new int[Constants.COUNT_SET_SIZE];

    public Lottery() {
        generateLotteryNumbers();
    }

    private void generateLotteryNumbers() {
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size() < Constants.COUNT_SET_SIZE) {
            int number = random.nextInt(Constants.MAX_NUMBER) + 1; // От 1 до 50
            uniqueNumbers.add(number);
        }

        int index = 0;
        for (int number : uniqueNumbers) {
            lotteryNumbers[index++] = number;
        }
    }

    public int[] getLotteryNumbers() {
        return lotteryNumbers;
    }

    public void printLotteryNumbers() {
        System.out.print("Win numbers: ");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

