package chapter3;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        int number1 = (int) (System.currentTimeMillis() % 10);
        // Multiply by 7 just to have a different number
        int number2 = (int) (System.currentTimeMillis() * 7 % 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        System.out.println(
            number1 +
                    " + " +
                    number2 +
                    " = " +
                    answer +
                    " is " +
                    (number1 + number2 == answer));
    }
}