package assignment3;

public class MultiplicationLoop {
    public static void main(String[] args) {

        String line;

        for (int i=1 ; i<=9; i++) {
            line ="";
            for (int j=1 ; j<=9; j++) {
                line += "(" + i + " * " + j + " = " + i*j + " ) ";
            }
            System.out.println(line);
        }
    }
}
