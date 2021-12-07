package chapter6;

public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        modify(x);
        System.out.println("after the call, x is " + x);
    }

    public static void modify(int n) {
        int y = n + 827348;
        System.out.println("n inside the method is " + y);
    }

    public static int incrementWithReturn(int n) {
        System.out.println("n inside the method is " + n);
        return n++;
    }
}