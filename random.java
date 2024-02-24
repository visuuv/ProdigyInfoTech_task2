import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess, attempts = 0;

        System.out.println("Welcome to the Random Number Guessing Game!");

        do {
            System.out.print("Guess the number (between 1 and 100): ");
            userGuess = input.nextInt();
            attempts++;

            if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
            }
        } while (userGuess != randomNumber);

        input.close();
    }
}
