package day08_scanner_logical_operators;

import java.util.Scanner;

/*create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean

 */
public class WorkStatus {

    public static void main(String[] args) {


Scanner input  =  new Scanner(System.in);
        System.out.print("Enter yor first name: ");
        String firstName = input.next();


        System.out.println("First name:\t " +firstName);

        System.out.println("Ener your last name : ");

String lastname = input.next();
        System.out.println("First name:\t"+ firstName+ "\n last name :\t"+lastname);


    }
}
