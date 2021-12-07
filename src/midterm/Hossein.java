package midterm;

public class Hossein {

    public static void main(String[] args) {

        numberOfLowerCases("Welcome to Java");
        numberOfDigits("Welcome 20 to 21 Java");
        appleOrange();
        uniqueCharacter("mnbvcxz");
        uniqueCharacter("qazwsxx");
    }

    public static void numberOfLowerCases(String sentence) {

        // initializing variables
        int lowerCaseCounter = 0;
        int sentenceLength = sentence.length();

        // for loop to go through every character in the sentence and check if it is between lowercase 'a' and lowercase 'z'
        for (int i = 0; i < sentenceLength; i++) {
            if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                lowerCaseCounter++;
            }
        }
        System.out.println("1_ Number of lowercase letters: " + lowerCaseCounter);
    }

    public static void numberOfDigits(String sentence) {
        // initializing variables
        int digitsCounter = 0;
        int sentenceLength = sentence.length();

        // for loop to go through every character in the sentence and check if it is between '0' and '9'
        for (int i = 0; i < sentenceLength; i++) {
            if (sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
                digitsCounter++;
            }
        }
        System.out.println("\n2_ Number of digits: " + digitsCounter + "\n");
    }

    public static void appleOrange() {
        // initializing max value
        final int maxNumber = 20;

        // looping through max value starting at 0
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 2 == 0 && i % 3 != 0) {  // Checking if the value only is divisible by 2
                System.out.println(i + "   Apple");
            } else if (i % 2 != 0 && i % 3 == 0) {   // Checking if the value only is divisible by 3
                System.out.println(i + "   Orange");
            } else if (i % 2 == 0 && i % 3 == 0) {   // Checking if the value is divisible by 2 and 3
                System.out.println(i + "   Apple-Orange");
            } else System.out.println(i + "    ");
        }
    }

    public  static void uniqueCharacter (String word) {
        int wordLength = word.length();
        boolean matchCounter = true;

        // nested for loop: checking each character against all characters in the word EXCEPT itself if they match matchCounter variable will be false
        for (int i=0; i<wordLength;i++) {
            for (int j=0; j<wordLength; j++) {
                if (i!=j) {
                    if (word.charAt(i) == word.charAt(j)) {
                        matchCounter = false;
                    }
                }
            }
        }
        if (matchCounter) {
          System.out.println("\n5_ " + word + " has ll unique characters: true");
        } else System.out.println("5_ " + word + " has ll unique characters: false");
    }
}


