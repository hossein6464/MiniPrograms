package assignment9;

public class TestFan {
    public static void main(String[] args) {

        Fan fanOne = new Fan();
        fanOne.setSpeed(3);
        fanOne.setRadius(10);
        fanOne.setColor("Yellow");
        fanOne.setOn(true);
        System.out.println("Using Android Studios toString generated Method = " + fanOne.toString());
        System.out.println("Using modified toString = " + fanOne.modifiedToString());

        Fan fanTwo = new Fan();
        fanTwo.setSpeed(3);
        fanTwo.setRadius(5);
        fanTwo.setColor("Blue");
        fanTwo.setOn(false);
        System.out.println("\nUsing Android Studios toString generated Method = " + fanTwo.toString());
        System.out.println("Using modified toString = " + fanTwo.modifiedToString());
    }
}
