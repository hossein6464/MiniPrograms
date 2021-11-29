package assignment2;

import java.util.Scanner;

public class CheckSSN {
    public static void main(String[] args) {

        System.out.println("Enter a SSN:");
        Scanner input = new Scanner(System.in);
        String sSN = input.next();

        if (sSN.length() == 11 && (sSN.charAt(0)>='0' && sSN.charAt(0)<='9')
                &&(sSN.charAt(1)>='0' && sSN.charAt(1)<='9')
                &&(sSN.charAt(2)>='0' && sSN.charAt(2)<='9')
                &&(sSN.charAt(3)=='-')
                &&(sSN.charAt(4)>='0' && sSN.charAt(4)<='9')
                &&(sSN.charAt(5)>='0' && sSN.charAt(5)<='9')
                &&(sSN.charAt(6)=='-')
                &&(sSN.charAt(7)>='0' && sSN.charAt(7)<='9')
                &&(sSN.charAt(8)>='0' && sSN.charAt(8)<='9')
                &&(sSN.charAt(9)>='0' && sSN.charAt(9)<='9')
                &&(sSN.charAt(10)>='0' && sSN.charAt(10)<='9')) {
            System.out.println(sSN + " is a valid social security number");
        } else {
            System.out.println(sSN + " is an invalid social security number");
        }
    }
}
