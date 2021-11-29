package assignment2;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Chose Scissor (0), Rock (1), Paper(2):");
        int userChoice = input.nextInt();

        int randomChoice = (int) (Math.random() * 3);
        System.out.println(randomChoice);
        switch (userChoice) {
            case 0:
                if (userChoice == randomChoice) {
                    System.out.println("The Computer is Scissor. You are Scissor too. It is a draw.");
                } else if (randomChoice == 1) {
                    System.out.println("The Computer is  Rock. You are Scissor. You lose.");
                } else if (randomChoice == 2){
                    System.out.println("The Computer is Paper. You are Scissor. You won.");
                }
                break;
            case 1:
                if (userChoice == randomChoice) {
                    System.out.println("The Computer is Rock. You are Rock too. It is a draw.");
                } else if (randomChoice == 0) {
                    System.out.println("The Computer is Scissor. You are Rock. You won.");
                } else if (randomChoice == 2){
                    System.out.println("The Computer is Paper. You are Rock. You lose.");
                }
                break;
            case 2:
                if (userChoice == randomChoice) {
                    System.out.println("The Computer is Paper. You are paper too. It is a draw.");
                } else if (randomChoice == 0) {
                    System.out.println("The Computer is Scissor. You are Paper. You lose.");
                } else if (randomChoice == 1){
                    System.out.println("The Computer is Rock. You are Paper. You won.");
                }
                break;
            default:
                System.out.println("Wrong Choice please choose between 0 and 1");
        }
    }
}
