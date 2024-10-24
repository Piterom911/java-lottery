package org.example;

import java.util.Scanner;

public class StartLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] userNumbers = new int[3][Constants.COUNT_SET_SIZE];

        for (int player = 0; player < 3; player++) {
            System.out.println("Player " + (player + 1) + ", enter unique number form 1 to 50:");
            for (int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
                int number;
                do {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    number = scanner.nextInt();
                } while (number < 1 || number > Constants.MAX_NUMBER || contains(userNumbers[player], number));

                userNumbers[player][i] = number;
            }
        }

        Lottery lottery = new Lottery();
        lottery.printLotteryNumbers();

        for (int player = 0; player < 3; player++) {
            System.out.print("Player number " + (player + 1) + ": ");
            for (int number : userNumbers[player]) {
                System.out.print(number + " ");
            }
            System.out.println();

            int matches = Utils.checkMatches(lottery.getLotteryNumbers(), userNumbers[player]);
            System.out.println("Player " + (player + 1) + " picked " + matches + " numbers.");
        }
    }

    private static boolean contains(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}


