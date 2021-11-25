package assignment1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // Requesting an input number between 0 to 999
        System.out.println("Enter a number between 0 to 999:");
        Scanner input = new Scanner(System.in);
        int numberEnteredByTheUser = input.nextInt();

        int hundredsExtracted = numberEnteredByTheUser / 100; // Calculating the number of 100s in the digit
        int tensStepOneExtraction = numberEnteredByTheUser / 10; // Step one of calculating the number of 10s in the digit
        int tensExtracted = tensStepOneExtraction % 10; // Step two of calculating the number of 10s in the digit
        int remainderExtracted = numberEnteredByTheUser % 10; // calculating the last digit

        int sumOfAllDigits = hundredsExtracted + tensExtracted + remainderExtracted; // Sum of all the digits

        System.out.println("The sum of the digits is: " + sumOfAllDigits);
    }
}
