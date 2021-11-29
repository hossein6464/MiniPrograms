package assignment3;

public class PredictingFutureTuition {
    public static void main(String[] args) {

        double  tuition = 10000;
        double rate = 0.07;
        int year = 0;
        while (tuition <= 20000 ) {
            tuition = tuition * (1+ rate) ;
            year++;
        }
        System.out.println("In this many years " + year);
    }
}
