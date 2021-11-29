package assignment3;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {

        // Creating a random number between 0 to 100
        int random = (int) (Math.random()*100+1);

        // creating an object of scanner to recieve inputs from the user
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number between 0 to 100:");
        int userGuess = input.nextInt();

        // the logic behind for comparing the numbers
        while (random != userGuess) {
            if (random > userGuess) {
                System.out.println("Your answer is too low: Please guess again");
                userGuess = input.nextInt();
            } else if (random < userGuess) {
                System.out.println("Your answer is too high: Please guess again");
                userGuess = input.nextInt();
            }
        }
        System.out.println("You finally guessed right");
    }
}
