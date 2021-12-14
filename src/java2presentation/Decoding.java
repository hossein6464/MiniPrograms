package java2presentation;

public class Decoding {
    private final static String[] dictionary = {"1","2","3","4","5","6","7","8","9",
                                        "10#","11#","12#","13#","14#","15#",
                                        "16#","17#","18#","19#","20#","21#",
                                        "22#","23#","24#","25#","26#"};
    private final static String[] dictionaryReference = {"a","b","c","d","e","f","g","h",
                                                 "i","j","k","l","m","n","o","p",
                                                 "q","r","s","t","u","v","w","x","y","z"};

    public static void main(String[] args) {
        String userInput = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        char[] convertedStringToCharacter = stringToCharConverter(userInput);
        System.out.println(decoded(convertedStringToCharacter));
    }

    public static String decoded (char[] c) {
        int i =0;
        String decodedWord = "";
        while (i < c.length) {

            if (i+2 < c.length && c[i+2] == '#') {
                String word = c[i] + String.valueOf(c[i+1])+ c[i + 2];
                for (int j = 0 ; j<dictionary.length; j++) {
                    if (word.equals( dictionary[j])) {
                        decodedWord +=dictionaryReference[j];
                    }
                }
                i += 3;
            }
            else {
                String word = String.valueOf(c[i]);
                for (int j = 0 ; j<dictionary.length; j++) {
                    if (word.equals( dictionary[j])) {
                        decodedWord +=dictionaryReference[j];
                    }
                }
                i++;
            }
        }
        return decodedWord;
    }

    public static char[] stringToCharConverter (String inputString) {
        // Creating array of string length
        char[] ch = new char[inputString.length()];

        // Copy character by character into array
        for (int i = 0; i < inputString.length(); i++) {
            ch[i] = inputString.charAt(i);
        }
        return ch;
    }
}
