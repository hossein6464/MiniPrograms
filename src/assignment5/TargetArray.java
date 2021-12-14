package assignment5;

import java.sql.Array;

public class TargetArray {
    public static void main(String[] args) {
        int [] first = {0,1,2,3,4};
        int [] targetIndex = {0,1,2,2,1};
        int [] targetArray = {-1,-1,-1,-1,-1};

        for (int i = 0; i <first.length; i++) {
            int temp= -2;
            int swap = -2;
            if (targetArray[targetIndex[i]] == -1) targetArray[targetIndex[i]] = first[i];
            else {
                temp = i;
                for (int t = first.length-1; t>temp; i-- ) {
                    swap = targetArray[t];
                    targetArray[targetIndex[i]] = first[i];
                }
            }
        }
     }
}
