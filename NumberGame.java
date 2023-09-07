import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1; // Define the lower bound of the range
        int upperBound = 100; // Define the upper bound of the range
        int maxAttempts = 10; // Define the maximum number of attempts
        
        boolean playAgain = true;
        int roundsWon = 0; // Initialize the rounds won counter
        
        while (playAgain) {
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
            System.out.println("You have " + maxAttempts + " attempts.");
            
            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Attempt " + (attempts + 1) + ". Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                }
            }
            
            if (hasGuessedCorrectly) {
                roundsWon++; // Increment rounds won if the user guesses correctly
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        
        System.out.println("Thank you for playing the Number Guessing Game!");
        System.out.println("Your score: " + roundsWon + " rounds won.");
        scanner.close();
    }
}

