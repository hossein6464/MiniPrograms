package chapter7;

import java.util.Scanner;

public class LottoNumbers {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        // This code is changed to cover  numbers between 0 and 4 to be easy to test it
        // 1- Create a boolean array as big as the numbers we have to cover
        boolean[] isCovered = new boolean[5]; // default false

        // Read all numbers and mark corresponding element covered
        int number  = 0;

        while (number != -1) {
            System.out.print("\nPlease select -1 to exit." +
                "\nPlease enter an Array index start from 0 to 4: ");
            isCovered[number] = true;

            // 2- User is going to make different indexes true.
            // For example number = 3 means user has a ticket with 3 on it
            number = input.nextInt();
        }

        // Check if all covered
        boolean allCovered = true; // Assume all covered

        // 3- Iterate on isCovered array, if an index was false return false
        for (int i = 0; i < 5; i++) {
            if (!isCovered[i]) {
                allCovered = false; // Find one number is not covered
                break;
            }
        }
        // Display result
        if (allCovered)
            System.out.println("\nThe tickets cover all numbers");
        else
            System.out.println("\nThe tickets don't cover all numbers");
    }
}