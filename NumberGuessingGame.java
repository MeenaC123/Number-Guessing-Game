package numberguessinggame;

import java.util.Random;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRange = 100;
        boolean playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(maxRange) + 1;  // Random number between 1 and maxRange
            int guess;
            int attempts = 0;
            playAgain = false;

            System.out.println("\nI'm thinking of a number between 1 and " + maxRange + ". Can you guess it?");

            // Game loop
            while (true) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                }
            }

            // Ask if the player wants to play again
            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("yes")) {
                playAgain = true;
            }
        } while (playAgain);

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}
