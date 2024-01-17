import java.util.*;

public class NumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            int attempts = 5;
            int number = random.nextInt(100) + 1;
            System.out.println("A new number has been generated between 1 and 100.");
            System.out.println("Guess the number within 5 attempts");

            while (attempts > 0) {
                System.out.println("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    break;
                }

                attempts--;

                if (attempts == 0) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + number);
                    break;
                }
            }

            System.out.print("Would you like to play again? Enter 'yes' to continue, or any other key to exit: ");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes")) break;
        }

    }
}

