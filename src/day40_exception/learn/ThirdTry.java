package day40_exception.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            System.out.println("enter a number");
            int num = input.nextInt();   // Possible InputMismatchException

            System.out.println("Enter number 2");
            int num2 = input.nextInt();  // Possible InputMismatchException

            System.out.println(num / num2);// Possible ArithmeticException
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block");
            input.close();
        }

        System.out.println("done");
    }
}
