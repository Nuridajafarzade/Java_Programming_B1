package day08_tasks;

import java.util.Scanner;
/* Enter your age
30
Enter you favorite numbers
7
you are a student : true /false
 */
public class PersonalInfo {

    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in) ;
        System.out.println( "Enter your age ");
byte age = input.nextByte();
        System.out.println(" Enter you favorite numbers: ");
long number = input.nextLong();
        System.out.println("you are a student "+ (18<=age && 25>=age));






    }



}
