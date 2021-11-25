package assignment1;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {

        // Requesting to user for their zone offset from GMT
        System.out.println("Enter the time zone offset to GMT:");
        Scanner input = new Scanner(System.in);
        int offSetZone = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Calculating the difference between the hours
        long currentHourOffSet = currentHour + offSetZone;

        // Display results
        System.out.println("Current time is " + currentHourOffSet + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
