package projects.com;

import java.util.Random;
import java.util.Scanner;

public class game_RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("In this game ");
        System.out.println ("Rock = 1, Paper = 2, Scissors = 3\nChoose number between(1-3)\nEnter Your number :");
        int Gene = random.nextInt(3) + 1;
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()){
            sc.next();
            System.out.println("Only integer allowed.");
        }
        int YourNum = sc.nextInt();
        System.out.println("System Number :");
        System.out.println(Gene);
        System.out.print("Result : ");
        // Rock = 1, Paper = 2; Scissor = 3;
        if ((YourNum == 3) && (Gene == 3)) {
            System.out.println("Play Again");
        } else if ((YourNum == 3) && (Gene == 1)) {
            System.out.println(" Scissor defeated by the Rock.\nYou loss.\n System win");
        } else if( (YourNum == 3) &&(Gene == 2) ) {
            System.out.println("Scissor cuts the Paper.\n You win");
        } else if ((YourNum == 2) && (Gene == 2)) {
            System.out.println("Play Again");
        } else if ((YourNum == 2) && (Gene == 3)) {
            System.out.println("Paper Cut by Scissor.\n You loss.\n System win");
        } else if ((YourNum == 2) && (Gene == 1)) {
            System.out.println("Paper defeats the Rock.\nYou win");
        } else if ((YourNum == 1) && (Gene == 1)) {
            System.out.println("play again");
        } else if ((YourNum == 1) && (Gene == 2)) {
            System.out.println("Rock defeated by the Paper.\n You loss.\n System win");
        } else if ((YourNum == 1)&& (Gene == 3)) {
            System.out.println("Rock defeats the Scissor.\n You win");
        }
    }
}
