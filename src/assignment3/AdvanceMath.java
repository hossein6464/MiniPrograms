package assignment3;

import java.util.Scanner;

public class AdvanceMath {
    public static void main(String[] args) {

        //initialization of the variables
        int subtraction = 0;

        // Loop for running 5 times
        int counter = 0;
        for (int i = 0; i<5; i++) {

            // getting two random numbers
            int random = (int) (Math.random()*10);
            int random2 = (int) (Math.random()*10);

            // if statement for making sure the smaller number gets subtracted for the larger one
            if (random>=random2) {
                subtraction = random - random2;
            } else if (random<random2) {
                subtraction = random2 - random;
            }

            // requesting a user Input or Guess
            System.out.println("Please enter your guess: ");
            // initialization of the scanner and receiving an input
            Scanner input = new Scanner(System.in);
            int userGuess = input.nextInt();

            // counter for keeping track when the user guesses the right answer
            if (userGuess == subtraction) {
                counter++;
            }
        }
        System.out.println("You answered " + counter + " Questions right");
    }
}
