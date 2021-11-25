package assignment1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        // Requesting user for the Weight in Pounds and turn in to Kilograms
        System.out.println("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double weightInKilogram  = weight * 0.453592;

        // Requesting user for the height in inches and turn it to meters
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        double heightInMeters = height * 0.0254;

        // Taking Height in Meters and Weight in Kilograms and calculating BMI with 4 decimals
        double calculatingBMI = (int) (weightInKilogram / (Math.pow(heightInMeters,2))*10000) /10000.0;


        System.out.println("BMI is: " + calculatingBMI);

    }
}
