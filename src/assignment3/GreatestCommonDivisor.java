package assignment3;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first positive Integer:");
        int firstInteger = input.nextInt();
        System.out.println("Please enter the second positive Integer:");
        int secondInteger = input.nextInt();

        int divisor;
        if (firstInteger>secondInteger) {
            divisor = secondInteger;
        } else {
            divisor = firstInteger;
        }
        for (int i = divisor; i>0; i--){
            int remainderOne = firstInteger%divisor;
            int remainderSecond = secondInteger%divisor;
            if (remainderOne>0 || remainderSecond>0) {
                divisor--;
            } else {
                break;
            }
        }
        System.out.println(divisor);
    }
}
