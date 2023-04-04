package projects.com;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
    System.out.println("find the year is leap year or not\nEnter the year");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0 )) {
        System.out.println( year  +     " is leap year");
    }
    else{
        System.out.println(year  +      " is not a leap year");
    }
}
}
