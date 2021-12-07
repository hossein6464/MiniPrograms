package assignment3;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        boolean continueAsking = true;
        Scanner input = new Scanner(System.in);

        while (continueAsking) {

            System.out.println("Please enter a word:");
            String palindrome = input.next().toLowerCase(Locale.ROOT);
            int lastIndex = palindrome.length() - 1;
            boolean palindromeTruth = true;

            for (int firstIndex = 0; firstIndex <= lastIndex; firstIndex++) {
                if (palindrome.charAt(firstIndex) == palindrome.charAt(lastIndex)) {
                    lastIndex--;
                } else if (palindrome.charAt(firstIndex) != palindrome.charAt(lastIndex)) {
                    palindromeTruth = false;
                    break;
                }
            }
            if (palindromeTruth == true) {
                System.out.println(palindrome + " is a palindrome");
            } else {
                System.out.println(palindrome + " is not a palindrome");
            }
            System.out.println("Do you want to keep asking: Y for Yes and N for No");
            String userRequest = input.next();
            if (!userRequest.equals("Y")) {
                continueAsking = false;
            }
        }
    }
}
