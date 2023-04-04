package projects.com;

import java.util.Random;
import java.util.Scanner;

public class all_Projects {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Guessing GAME");
        System.out.println("Enter the 3 values between 1-10 : ");
        int auto = rand.nextInt(1, 10);
        int x,y,z;
         x = in.nextInt();
         y = in.nextInt();
         z= in.nextInt();
        System.out.println("The number is  :");
                System.out.println(auto);
        if (x == auto || y==auto || z==auto) {
                System.out.println("Congratulations you guess correctly :)");
        } else {
                System.out.println("Better luck next time :) ");
        }
    }
}
