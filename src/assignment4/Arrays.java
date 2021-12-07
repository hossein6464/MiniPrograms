package assignment4;

public class Arrays {

    public static void main(String[] args) {

        randomShuffling();
        locateTheLargestElement();
        addAllElementsArray();
        shiftElements();
        average();
        characterInteger();
    }

    public static void addAllElementsArray () {
        double sum = 0;
        double sum2 = 0;
        double[] myList = {2.32,4.32,8.34,3,4,3,5,9};

        for (double s: myList) {
            sum2 += s;
        }
        for (int i =0; i<myList.length; i++){
            sum += myList[i];
        }
        System.out.println("Sum of all elements in the array is: " + sum2);
    }
    public static void locateTheLargestElement() {

        double[] myList = {2.32,432.32,543.34,3,45456,345,2345,4312};
        double largest =0;

        for (int i =0; i<myList.length; i++){
            if (myList[i]> largest) {
                largest = myList[i];
            }
        }
        System.out.println("\n" +
                "The largest element in the array is: " + largest);
    }

    public static void randomShuffling () {
        double[] myList = {2.32,432.32,543.34,3,45456,345,2345,4312};
        double buffer;

        for (int i =0; i<myList.length; i++) {

            int random = (int)  (Math.random() * myList.length );

            if (myList[i] != myList[random]) {
                buffer = myList[i];
                myList[i] = myList[random];
                myList[random] = buffer;
            }
        }
        for (int i =0; i<myList.length; i++) {
            System.out.print(myList[i] + ", ");
        }
    }
    public static void shiftElements() {
        double[] myList = {2.32,432.32,543.34,3,45456,345,2345,4312};

        double buffer = myList[0];

        for (int i =1; i<myList.length; i++) {
            myList[i-1] = myList[i];
        }
        myList[myList.length-1] = buffer;
        for (int i =0; i<myList.length; i++) {
            System.out.print( myList[i] + ", ");
        }
        System.out.println("");
    }

    public static void average() {

        int numberArray [] = new int [20];
        for (int i=0; i<20; i++) {
            int random = (int)  (Math.random() * 20 );
            numberArray[i] = random;
            System.out.print(random + ", ");
        }

       // double[] myList = {2.32,4.32,8.34,3,4,3,5,9};
        int sum2 = 0;
        int counter = 0;
        for (int s: numberArray) {
            sum2 += s;
        }

        double average = sum2/numberArray.length;

        for (double s: numberArray) {
            if (s>average) {
                counter++;
            }
        }
        System.out.println("\n" + counter + " Numbers are above average which is: " + average);
    }
    public static void characterInteger () {
        for (int i ='a'; i<'z'; i++ ) {
            System.out.println(i );
        }
    }

}



