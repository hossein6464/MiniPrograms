package chapter7;

public class SelectionSort {

    /**
     * The method for sorting the numbers
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            // Find new min in the rest of the array from our current position
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    // We have a better candidate for min, so update new min
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex]
            // if new min in new index is found swap it with current i index which is the
            // first element of the unsorted part of array
            if (currentMinIndex != i) {
                // Assign current first element of the unsorted part of array to current j index
                list[currentMinIndex] = list[i];

                // Assign original j index value to current i index
                list[i] = currentMin;
            }
        }
    }
}
