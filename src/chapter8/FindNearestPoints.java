package chapter8;

import java.util.Scanner;

public class FindNearestPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];

        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // point1Index and point2Index are the indices in the points array
        int point1Index = 0, point2Index = 1; // Initial two points

        // Initialize shortestDistance with two first points
        double shortestDistance = distance(
                points[point1Index][0],       // Point 0 x
                points[point1Index][1],       // Point 0 y
                points[point2Index][0],       // Point 1 x
                points[point2Index][1]);      // Point 1 y

/*
                |-1.0, 3.0|  First point
                |-1.0,-1.0|  Second point
                | 1.0, 1.0|
                | 2.0, 0.5|
                | 2.0,-1.0|
                | 3.0, 3.0|
                | 4.0, 2.0|
                | 4.0,-0.5|  points.length
 */

        // Compute distance for every two points
        // First point
        for (int firstPointIndex = 0; firstPointIndex < points.length; firstPointIndex++) {
            // Second point
            for (int secondPointIndex = firstPointIndex + 1; secondPointIndex < points.length; secondPointIndex++) {

                double distance = distance(
                        points[firstPointIndex][0],
                        points[firstPointIndex][1],
                        points[secondPointIndex][0],
                        points[secondPointIndex][1]); // Find distance

                // If what we have as a shortestDistance at the moment is grater than current calculated distance
                // replace it with the current distance
                if (shortestDistance > distance) {
                    point1Index = firstPointIndex;    // Update point1Index
                    point2Index = secondPointIndex;   // Update point2Index
                    shortestDistance = distance;      // Update shortestDistance
                }
            }
        }

        // Display result
        System.out.println("The closest two points are " +
                "(" + points[point1Index][0] + ", " + points[point1Index][1] + ") and (" +
                points[point2Index][0] + ", " + points[point2Index][1] + ")");
    }

    /**
     * Compute the distance between two points (x1, y1) and (x2, y2)
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
