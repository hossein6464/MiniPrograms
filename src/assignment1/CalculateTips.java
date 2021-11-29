package assignment1;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {

        // Requesting user for the total amounts
        System.out.println("Enter the subtotal amount: ");
        Scanner input = new Scanner(System.in);
        double totalAmount = input.nextDouble();

        // Requesting user for the tips rate
        System.out.println("Enter the gratuity rate: ");
        double tipsRate = input.nextDouble();

        double calculatedTips = (int)((totalAmount * (tipsRate/100)) * 100) / 100.0; // Multiplying the whole amount by 15 percent
        double totalAmountPlusTips = calculatedTips + totalAmount; // Calculating the total amount + tips

        // Presenting the user with the total amount and the tips
        System.out.println("The gratuity is $" + calculatedTips + " and total is $" + totalAmountPlusTips);
    }
}

