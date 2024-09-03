import java.util.Scanner;
import java.util.Random;
public class javaGuess{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 2;
        int totalAttempt = 7;
        int totalScore = 0;
        for (int round = 1; round <= rounds; round++) {
            int guessNumber = random.nextInt(100) + 1;
            int left = totalAttempt;
            boolean correct = false;
            System.out.println("Number Guessing Game is Start.\nRound " + round + "!");
            System.out.println("You have " + left + " attempts to guess the number between 1 and 100.");
            while (left > 0) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                left--;
                if (guess == guessNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + guessNumber + ".");
                    totalScore += totalAttempt - left;
                    correct = true;
                    break;
                } else if (guess < guessNumber) {
                    System.out.println("Yor had entered low of number! Now you have " + left + " attempts left.");
                } else {
                    System.out.println("Yor had entered high of number! You have " + left + " attempts left.");
                }
            }
            if (!correct) {
                System.out.println("Sorry, you have run out of attempts. The correct number was " + guessNumber + ".");
            }
        }
        System.out.println("\nNumber Guessing Game is over! Now, Your total score after " + rounds + " rounds is " + totalScore + ".");
        System.out.print("Would you like to play again? (Yes/no): ");
        String playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("Yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing the Number Guessing Game!");
        }
        scanner.close();
    }
}