package assignment2;

import java.util.Scanner;

public class FutureDates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day:\n(For Sunday enter 0, Monday 1, Tuesday 2, Wednesday 3, Thursday 4, Friday 5, Saturday 6) ");
        int dateOfToday = input.nextInt();

        System.out.println("Enter the number of days elapsed since today:");
        int daysElapsed = input.nextInt();

        int futureDateRemainder = daysElapsed % 7;
        int actualFutureDate = futureDateRemainder + dateOfToday;
        String todayDate = new String();
        String futureDate = new String();

        switch (actualFutureDate) {
            case 0:
                futureDate = "Sunday";
                break;
            case 1:
                futureDate = "Monday";
                break;
            case 2:
                futureDate = "Tuesday";
                break;
            case 3:
                futureDate = "Wednesday";
                break;
            case 4:
                futureDate = "Thursday";
                break;
            case 5:
                futureDate = "Friday";
                break;
            case 6:
                futureDate = "Saturday";
                break;
        }

        switch (dateOfToday) {
            case 0:
                todayDate = "Sunday";
                break;
            case 1:
                todayDate = "Monday";
                break;
            case 2:
                todayDate = "Tuesday";
                break;
            case 3:
                todayDate = "Wednesday";
                break;
            case 4:
                todayDate = "Thursday";
                break;
            case 5:
                todayDate = "Friday";
                break;
            case 6:
                todayDate = "Saturday";
                break;
        }

        System.out.println( "Today is " + todayDate  + " and the future day is "+ futureDate);
    }
}
