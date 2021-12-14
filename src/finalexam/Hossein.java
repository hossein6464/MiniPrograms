package finalexam;

import java.util.ArrayList;

public class Hossein {
    public static void main(String[] args) {

        // Sample arrays initialized
        final int[] sampleOneDimensionalArray = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2, 2,8};
        final double[][] twoDimensionalArray = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int lengthOfSampleArray = sampleOneDimensionalArray.length;

        System.out.println("1_ Number of occurences: ");
        findRepeatedNumber(sampleOneDimensionalArray);
        if (lengthOfSampleArray<1) {
            System.out.println("2_ Second largest element: Array should have at least 1 elements");
        } else {
            System.out.println("2_ Second largest element: " + findSecondLargestInt(sampleOneDimensionalArray));
        }
        System.out.println("3_ Array equal: " + equals(sampleOneDimensionalArray,sampleOneDimensionalArray));
        System.out.println(sumColumn(twoDimensionalArray,2));
    }

    public static void findRepeatedNumber(int inputArray[]) {

        int length = inputArray.length;

        for (int i = 0; i<length;i++) {
            int counter = 1;
            if (inputArray[i] != 0) {
                for (int j = 0; j < length; j++) {
                    if (i != j) {
                        if (inputArray[i] == inputArray[j]) {
                            inputArray[j] = 0;
                            counter++;
                        }
                    }
                }
                System.out.println(inputArray[i] + " : " + counter);
            }
        }
        // creating a for loop for the size of the array
        // inside the loop we for the size of the loop to be smaller than size of the array -1
        // inside our if we will check if every element of the current array is equal to the next element
        // if it is we will increase our counter
//        for (int i = 0; i < length; i++) {
//            if (i < length - 1) {
//                if (sortedArray[i] == sortedArray[i + 1]) {
//                    counter++;
//                }
//            } else {
//                System.out.println(sortedArray[i] + " : " + counter); // if we get to else we know we reached our array
//            }
//            if (i < length - 1 && sortedArray[i] != sortedArray[i + 1]) {
//                System.out.println(sortedArray[i] + " : " + counter); //moving to the next element in the array
//                counter = 1;
//            }
//        }
    }

    public static int findSecondLargestInt(int inputArray[]) {

        // Method to find maximum in arr[]
        int i;
        // Initialize maximum element and initialize the secondLargest
        int maxSecond =0;

        int max = inputArray[0];
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                maxSecond = max;        // assign the largest number to the second largest after finding another number
                max = inputArray[i];    // assign new number to the largest after finding another number
            }
            // Keep going through the loop even after finding
            // the largest to see if there is larger number than the second
            else if (inputArray[i] > maxSecond) {
                maxSecond = inputArray[i];
            }
        }
        return maxSecond;
    }

    public static boolean equals (int[] list1, int[] list2) {

        //  initialization of both arrays length and a boolean tracker
        int arrayOneSize = list1.length;
        int arrayTwoSize = list2.length;
        boolean tracker = true;

        // checking to see if both array has the same size if they do not we return the tracker as false
        if (arrayOneSize == arrayTwoSize) {
            // going through both arrays and checking, even if one element inside the array is not equal, the tracker turns false
            for (int i = 0; i < arrayOneSize; i++) {
                if (list1[i] != list2[i]) {
                    tracker = false;
                }
            }
        } else return false;

        // checking to see if the track is true if it is then both arrays are equal and if not we return false
        if (tracker) return true;
        else return false ;
    }

    public static double sumColumn (double[][] m, int columnIndex) {

        // initializing a double for sum of all elements in a specific column and the size of the rows
        double sum=0;
        int rowSize = m.length;

        // inside this for loop we go through each row of the array
        // if the length of the array's column is either equal or bigger than the index column the user inputs
        // the value of that specific column gets added to the sum
        // if the column is smaller than what the user requested we will ignore it.
        // Finally, returning the sum
        for (int i=0; i<rowSize; i++) {
            if (m[i].length>columnIndex) {
                sum += m[i][columnIndex];
            }
        }
        System.out.print("4_ The sum in column " + columnIndex + " is: ");
        return sum;
    }

    // taking an array and returning a sorted array of integer
    public static int[] sort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list
            int currentMin = list[i];
            int currentMinIndex = i;
            // Find new min in the rest of the array from our current position
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex]
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }

}
