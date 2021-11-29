package assignment3;

import java.util.Scanner;

public class AdditionRandomNumber {
    public static void main(String[] args) {

        // Creating a random number between 0 to 100
        int random = (int) (Math.random()*51);
        int random2 = (int) (Math.random()*51);
        int sum = random+random2;

        // creating an object of scanner to recieve inputs from the user
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter guess:");

        int userGuess = -1;
        // the logic behind for comparing the numbers
        while (sum != userGuess) {
               userGuess = input.nextInt();
            if (sum > userGuess) {
                System.out.println("Your answer is too low: Please guess again");
            } else if (sum < userGuess) {
                System.out.println("Your answer is too high: Please guess again");
            }
        }
        System.out.println("You finally guessed right");
    }
}

