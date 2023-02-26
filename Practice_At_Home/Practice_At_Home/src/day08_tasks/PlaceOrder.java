package day08_tasks;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("enter the product name ");

String productName = age.nextLine();
        System.out.println("enter the price ");
double price = age.nextDouble();
        System.out.println("enter the quantity:" );
int quantity = age.nextInt();
age.nextLine();
        System.out.println("enter full name: ");
String name=age.nextLine();

double total = price*quantity;
        System.out.println(name + " your order for " +quantity+" " + productName+" has been placed "+" your total cost is $ " + total);





    }





}
