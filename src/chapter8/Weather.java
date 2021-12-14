package chapter8;

public class Weather {

    public static void main(String[] args) {

        double[][][] dailyWeatherData =
                {      //    Hour0           Hour1           Hour2
                        {{10,12, 33,74}, {10,13, 33,78}, {10,14, 33,72}}, // Day 0
                        {{11,12,-15,16}, {11,13,-19,20}, {11,14,-23,24}}, // Day 1
                        {{12,12, 11,99}, {12,13, 11,99}, {12,14, 11,99}}  // Day 2
                };     // D  H   T  H

        calculateAverage(dailyWeatherData);

    }

    private static void calculateAverage(double[][][] myDailyWeatherData) {

        // Find the average daily temperature and humidity
        for (int eachDay = 0; eachDay < myDailyWeatherData.length; eachDay++) {

            int dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
            for (int eachHour = 0; eachHour < myDailyWeatherData[eachDay].length; eachHour++) {

                dailyTemperatureTotal += myDailyWeatherData[eachDay][eachHour][2];
                dailyHumidityTotal    += myDailyWeatherData[eachDay][eachHour][3];
            }

            // Display result
            System.out.println("\n");
            System.out.println("Day  " + eachDay + "'s average temperature is: " + dailyTemperatureTotal / myDailyWeatherData[0].length);
            System.out.println("Day  " + eachDay + "'s average humidity is:    " + dailyHumidityTotal / myDailyWeatherData[0].length);
        }
    }
}


