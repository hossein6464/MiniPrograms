package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayNumbers = new ArrayList<>(); // creating an arraylist of Integers for the second array as we don't know the size
        int userNumberInputs;
        System.out.println("Enter 10 numbers: ");
        // Asking for 10 integer inputs from user
        for (int i=0; i<10; i++) {
            int counter = 0;
            userNumberInputs = input.nextInt();
            // nested for loop to check each user input against the values in the Arraylist if the counter is less than one it gets added to the list
            for (int j=0; j<arrayNumbers.size(); j++) {
                if (userNumberInputs == arrayNumbers.get(j)) {
                    counter++;
                }
            }
            if (counter<1) {
                arrayNumbers.add(userNumberInputs);
            }
        }
        System.out.println( "The number of distinct number is: " + String.valueOf(arrayNumbers.size()));
        System.out.println("Distinct numbers are: " + arrayNumbers.toString());
    }
}

