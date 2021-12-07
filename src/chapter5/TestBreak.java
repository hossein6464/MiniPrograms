package chapter5;

public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            System.out.println("number: "  + number);
            if (sum >= 100) break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}