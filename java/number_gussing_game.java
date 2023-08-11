import java.util.*;

public class number_gussing_game {

    public static void NumberGussingGame() {

        Scanner sc = new Scanner(System.in);

        // use to genrate random number for game 
        int number = 1 + (int) (100 * Math.random());

        int K = 5;

        int i, guess;

        System.out.println( "A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the right number.");
                break;
            } else if (number > guess
                    && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            } else if (number < guess
                    && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted" + " K trials.");

            System.out.println( "The number was " + number);
        }
    }

    public static void main(String[] args) {
        NumberGussingGame();
    }

}
