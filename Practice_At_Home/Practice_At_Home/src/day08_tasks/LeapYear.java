package day08_tasks;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {

        Scanner age = new Scanner(System.in) ;
        System.out.println("Enter a year ");
int year = age.nextInt();
        System.out.println(year +" is a leap year " +(year % 4 ==0));
        System.out.println(year +" is a leap year " +(year % 4 !=0));



    }



}
