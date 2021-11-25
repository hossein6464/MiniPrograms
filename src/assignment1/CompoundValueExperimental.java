package assignment1;

import java.util.Scanner;

public class CompoundValueExperimental {
    public static void main(String[] args) {

        // Requesting user for the Saving Amount
        System.out.println("Enter the Saving amount each month: ");
        Scanner input = new Scanner(System.in);
        double savingAmount = input.nextDouble();

        // Requesting user for the Saving Amount
        System.out.println("Enter the yearly rate percentage: ");
        double rate = input.nextDouble();
        double ratePerMonth = (rate/100)/12; // calculating monthly rate

        // Requesting user for the number of the months
        System.out.println("Enter for how many months you will hold the money for: ");
        double numberOfMonths = input.nextDouble();

        // initializing the variable
        double compoundedAmountAndSavings = 0;

            // Loop for Calculating the compound amound for the number of months entered by the user
            for (int i = 1; i <= numberOfMonths; i++) {
                compoundedAmountAndSavings = (savingAmount + compoundedAmountAndSavings) * (1 + ratePerMonth);
            }

        // Turning the Compound Saving to two decimals
        double compoundSavingTwoDecimals = (int) (compoundedAmountAndSavings * 100) / 100.0;
        System.out.println(compoundSavingTwoDecimals);
    }
}
