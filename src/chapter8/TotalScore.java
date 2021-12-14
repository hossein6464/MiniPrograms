package chapter8;

public class TotalScore {

    public static void main(String[] args) {

//        double[][] studentScoresArray = {

//                {20.5, 22.5, 15, 21.5, 2.5},  // Student 0
//                {20.5, 22.5, 15, 21.5, 2.5},  // Student 1
//                {20.5, 22.5, 15, 21.5, 2.5},  // Student 2
//                {20.5, 22.5, 15, 21.5, 2.5},  // Student 3
//                {20.5, 22.5, 15, 21.5, 2.5},  // Student 4
//                {20.5, 22.5, 15, 21.5, 2.5}   // Student 5
//        };

        double[][][] studentScoresArray = {
                //   C1           C2          C3          C4          C5
                {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},  // Student 0
                {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},  // Student 1
                {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},  // Student 2
                {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},  // Student 3
                {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},  // Student 4
                {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}},  // Student 5
                {{1.5, 29.5}, {6.4, 22.5}, {14, 30.5}, {10, 30.5}, {16, 6.0}}   // Student 6
                //P1   P2      P1   P2      P1   P2     P1  P2      P1  P2
        };
        calculateTotalScore(studentScoresArray);

    }

    private static void calculateTotalScore(double[][][] studentScoresArray) {
        // Calculate and display total score for each student
        for (int currentStudent = 0; currentStudent < studentScoresArray.length; currentStudent++) {

            double totalScore = 0;
            for (int courseNumber = 0; courseNumber < studentScoresArray[currentStudent].length; courseNumber++)
                for (int examPart = 0; examPart < studentScoresArray[currentStudent][courseNumber].length; examPart++)
                    totalScore += studentScoresArray[currentStudent][courseNumber][examPart];

            System.out.println("Student " + currentStudent + "'s score is " + totalScore);
        }
    }
}