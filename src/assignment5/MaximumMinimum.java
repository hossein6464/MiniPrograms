package assignment5;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumMinimum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        ArrayList<Integer> minimumNumbers = new ArrayList<>();
        int maxSum = 0;
        for (int i = 0; i<num.length; i=i+2) {
                minimumNumbers.add(min(num[i], num[+1]));
        }

    }
    public static int min (int numberOne, int numberTwo) {
        int minimumNumber = numberOne;
        if (minimumNumber<numberTwo) {
            minimumNumber = numberTwo;
        }
        return minimumNumber;
    }
}
