package chapter7;

import chapter4.RandomCharacter;

public class CountLettersInArray {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // 1- Declare and create an array with random characters
        char[] chars = createArray();

        // 2- Display the array
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        // 3- Count the occurrences of each letter
        int[] counts = countLetters(chars);

        // 4- Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    /**
     * 1- Create an array of random characters
     */
    public static char[] createArray() {
        // Declare an array of characters and create it
        char[] chars = new char[9];

        // Create lowercase letters randomly and assign
        // them to the array
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();

        // Return the array
        return chars;
    }

    /**
     * 2- Display the array of characters
     */
    public static void displayArray(char[] chars) {
        // Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                // After printing 20th char go to the next line
                System.out.println(chars[i]);
            else
                // If it is not 20th char just print it + some space to the next char
                System.out.print(chars[i] + " ");
        }
    }

    /**
     * 3- Count the occurrences of each letter
     */
    public static int[] countLetters(char[] chars) {
        // 1- Declare and create an array of 26 int
        int[] counts = new int[26];

        // 2- For each lowercase letter in the array, count it
        for (int i = 0; i < chars.length; i++){
            // a=97, z=122
            counts[chars[i] - 'a']++; // counts[4]++
        }

        return counts;
    }

    /**
     * 4- Display counts
     */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            else
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
        }
    }
}
