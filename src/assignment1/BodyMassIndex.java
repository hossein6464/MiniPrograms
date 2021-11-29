package assignment1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        // constants
        final double HEIGHT_INCHES_TO_METERS = 0.0254;
        final double WEIGHT_POUNDS_TO_KILOGRAM = 0.453592;

        // Requesting user for the Weight in Pounds and turn in to Kilograms
        System.out.println("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double weightInKilogram  = weight * WEIGHT_POUNDS_TO_KILOGRAM;

        // Requesting user for the height in inches and turn it to meters
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        double heightInMeters = height * HEIGHT_INCHES_TO_METERS;

        // Taking Height in Meters and Weight in Kilograms and calculating BMI with 4 decimals
        double calculatingBMI = (int) (weightInKilogram / (Math.pow(heightInMeters,2))*10000) /10000.0;


        System.out.println("BMI is: " + calculatingBMI);

    }
}
