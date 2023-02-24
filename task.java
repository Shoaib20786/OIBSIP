
import java.util.Scanner;

public class task {
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 10;

        int i, guess;

        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
        System.out.println("best of luck!");

        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");

                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess + "\nYou have " + (K-1) + " tries left");
                --K;
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess + "\nYou have " + (K-1) + " tries left");
                --K;
            }
        }

        if (i == K ) {
            System.out.println("You have exhausted  your trials. \nYou lose!");

            System.out.println("The number was " + number);

        }

        System.out.println("Your score is "+((11-K)*10)+" out of 100");
    }

    public static void main(String[] arg)
    {

        guessingNumberGame();
    }
}

