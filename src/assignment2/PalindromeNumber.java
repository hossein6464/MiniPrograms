package assignment2;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer:");
        int digits = input.nextInt();
        int hundreds = digits / 100;
        int ones = digits % 10;

        if (hundreds == ones) {
            System.out.println( digits + " is a palindrome." );
        } else {
            System.out.println(digits + " is NOT a palindrome.");
        }
    }
}
