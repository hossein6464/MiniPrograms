package finalproject;
/*
                                                  500. Keyboard Row
                                      https://leetcode.com/problems/keyboard-row/
                                            Represented By Hossein 12-06-2021

Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

Constraints:
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).

Solution:
    First step, to the solution would be defining variables. We need a boolean to keep track of the words and since we don't know
the actual size of the return array we need to definie an ArrayList. Now, Every time we find a match in our array of words,
the Boolean will return true and that specific word gets added to our ArrayList.
    Second step, Defining a loop to go through every element in our array of Strings. Inside the for loop we need to use an if statement
 with 3 parts which each is divided by an || (or). Now we need to use Regex to help us with the match
		wordsArray[i].toLowerCase().matches("[qwertyuiop]+") ||
		wordsArray[i].toLowerCase().matches("[asdfghjkl]+") ||
		wordsArray[i].toLowerCase().matches("[zxcvbnm]+“
		[]: The brackets mean Find one character from the options between the bracket
		n+ :  Matches any string that contains at least one of n
		regardless of how many times the characters inside the strings are repeated if they match string between the bracket, if statement
		will return true and the word gets added to the list.
		if even one element in word does not match the whole statement will become false.
 */

import java.util.ArrayList;
import java.util.List;

public class FindWords {
    private static final Character[] row1 = {'q','w','e','r','t','y','u','i','o','p'};
    private static final Character[] row2 = {'a','s','d','f','g','h','j','k','l'};
    private static final Character[] row3 = {'z','x','c','v','b','n','m'};

    public static void main(String[] args) {

        String[] sampleCases = {"2134", "zxcvbnm", "ergds", "bcxbc", "gsdfgsdhsd", "wewrytyreqq"};
        // returning a list of string and turning it into an array and print it
        System.out.println(findWords(sampleCases));
        System.out.println(findWordsTwo(sampleCases));

    }

    public static List<String> findWords(String[] wordsArray) {

        List<String> listOfWordsFound=new ArrayList<>();
        for(int i=0;i<wordsArray.length;i++){
            boolean tracker=false;

            // Using regex to match the lowercase of each string in our array of string
            // 	Find one character from the options between the brackets
            //  n+ :  Matches any string that contains at least one of n
            // if all elements match we return true
            if(wordsArray[i].toLowerCase().matches("[qwertyuiop]+") ||
                    wordsArray[i].toLowerCase().matches("[asdfghjkl]+") ||
                    wordsArray[i].toLowerCase().matches("[zxcvbnm]+")) tracker=true;
            if(tracker) listOfWordsFound.add(wordsArray[i]);
        }
        return listOfWordsFound;
    }

    // solving the problem in a different approach
    // After receiving an array of words
    // Taking the first word first character and see if we can locate it in our rows
    // if we find a match we go through each character of the same word if they all match the same row
    // our tracker will return true and add the word to our ArrayList
    // Once the loop is finished the method will return the list of matched words
    public static List<String> findWordsTwo(String[] wordsArray) {

        List<String> listOfWordsFound=new ArrayList<>();

        for (String word: wordsArray) {
            Boolean tracker= true;
            int row = findRow(word.charAt(0));

            if (row==-1) { // if the words first character does not match to any of the row's character return false
                tracker=false;
            }
            else {
                // going through the rest of the characters in the same words to see if they match the same row return false if not
                for (int i = 1; i < word.length(); i++) {
                    if (findRow(word.charAt(i)) != row) {
                        tracker = false;
                        break;
                    }
                }
            }
            // if the tracker boolean still true add the word to the list
            if (tracker) listOfWordsFound.add(word);
        }
        return listOfWordsFound;
    }

    public static int findRow(Character c) {

        c = Character.toLowerCase(c);

        // going through each character array and search for a match with the first character of the first word and return the word
        for (int i = 0; i < row1.length; i++) {
            if (c == row1[i]) {
                return 1;
            }
        }
        for (int i = 0; i < row2.length; i++) {
            if (c == row2[i]) {
                return 2;
            }
        }
        for (int i = 0; i < row3.length; i++) {
            if (c == row3[i]) {
                return 3;
            }
        }
        return -1;
    }
}
