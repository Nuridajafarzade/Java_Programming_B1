package day08_tasks;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter product price and quantity");
       double price = input.nextDouble();
       double quantity = input.nextDouble();

 double revenue= price * quantity;
        System.out.println("Revenue " + revenue);







    }






}
