package chapter3;

import java.util.Scanner;

public class SimpleIfDemo {

    public static void main(String[] args) {

        System.out.println("Enter an integer: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 5 == 0)
            System.out.println("HiFive");

        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}
