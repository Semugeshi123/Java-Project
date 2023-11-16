import java.util.Scanner;

public class do2org{
    public static void main(String[] args) {
        // Simple Do-While Loop Example for Number Guessing
        int secretNumber = 42;
        int userGuess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the secret number!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
            }
        } while (userGuess != secretNumber);

        scanner.close();
    }
}