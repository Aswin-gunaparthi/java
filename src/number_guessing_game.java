import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min;
        int max;

        System.out.println("Number guessing game");

        System.out.print("enter the minimum number: ");
        min = sc.nextInt();

        System.out.print("Enter the maximum number: ");
        max = sc.nextInt();

        int randomNumber = random.nextInt(min, max + 1);

        System.out.printf("Guess a number between %d to %d\n",min,max);

        do {
            System.out.print("Enter the number: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
        sc.close();
    }
}
