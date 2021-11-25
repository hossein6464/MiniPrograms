package assignment1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        // Requesting user to enter each axis and y coordinates of the triangle
        System.out.println("Enter the coordinates of the triangle to calculate the area: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the point 1 x axis: ");
        int x1 = input.nextInt();
        System.out.println("Enter the point 1 y axis: ");
        int y1 = input.nextInt();
        System.out.println("Enter the point 2 x axis: ");
        int x2 = input.nextInt();
        System.out.println("Enter the point 2 y axis: ");
        int y2 = input.nextInt();
        System.out.println("Enter the point 3 x axis: ");
        int x3 = input.nextInt();
        System.out.println("Enter the point 3 y axis: ");
        int y3 = input.nextInt();

        //Calculating the area of the triangle
        double areaOfTriangle = Math.abs(1d/2 * ((x1 * (y2-y3)) + (x2 * (y3-y1)) + (x3 * (y1-y2))));
        System.out.println("Area of the triangle is: " + areaOfTriangle);
    }
}
