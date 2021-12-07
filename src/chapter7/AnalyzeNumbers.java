package chapter7;

public class AnalyzeNumbers {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");

        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        // 1- Receive numbers from user and calculate the sum
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        // 2- Calculate the average
        double average = sum / n;

        // 3- Find how many elements are above average
        int count = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count++;

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}