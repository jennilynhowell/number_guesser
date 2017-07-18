package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(100) + 1;

        int counter = 0;
        boolean win = false;

        while (counter < 11) {

            System.out.println("Let's play Number Guesser. Guess my number (between 1 and 100!)");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            int guess = Integer.parseInt(userInput);

            counter ++;

            if (guess > computerNumber) {
                System.out.println("Too high!");
            } else if (guess < computerNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Right on! It took you " + counter + " guesses.");
                win = true;
                break;
            }

        }

        if (!win) {
            System.out.println("Too bad. The number was: " + computerNumber + ".");
        }

    }
}
