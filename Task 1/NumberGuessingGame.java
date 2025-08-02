import java.util.Scanner;
import java.util.Random;

public class EasyGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
        int attempts = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;

            if (attempts == 0) {
                System.out.println("Sorry! correct number was: " + numberToGuess);
            } else {
                System.out.println("Attempts left: " + attempts);
            }
        }

        sc.close();
    }
}
