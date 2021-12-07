package assignment5;

import java.util.Scanner;

public class IsConsecutiveFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values: ");

        int numberOfValues = input.nextInt();
        int values [] = new int[numberOfValues];

        // adding the user's input to an array
        System.out.println("Enter the values");
        for (int i=0; i<values.length; i++) {
            values[i] = input.nextInt();
        }
        // Passing the values in the array to the method (isConsecutiveFour) if the return value is true it will print out it has consective fours
       if ( isConsecutiveFour(values)) {
           System.out.println("The list has consecutive fours");
       } else {
           System.out.println("The list does not have consecutive fours");
       }
    }

    public static boolean isConsecutiveFour(int[] values) {

        // going through each element of the array if the value is repeated incrementing a counter
        // if the counter is bigger or equal 4 return true value
        for (int j=0; j<values.length; j++) {
            int counter = 1;
            for (int i =0; i<values.length; i++) {
                if (i != j && values[j] == values[i]) {
                    counter++;
                }
            }
            if (counter>=4) {
                return true;
            }
        }
        return false;
    }
}
