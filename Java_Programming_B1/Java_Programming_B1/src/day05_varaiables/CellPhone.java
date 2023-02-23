package day05_varaiables;

public class CellPhone {

    /*
    create a main method
    declare and assign thede variables:
      brand,model, color,price, srorage, hasCamera, sim(charA,B,C)
      Print all the variable
       sample tata: apple, iphone 10, black, 1000.99, 128 ,true, A
     */
    public static void main(String[] args) {
       String brand = "apple";
       String model = "Iphone 10";
       String color = "black";
       double price =1000.99;
       int storage =128;
       boolean hasCamera =true;
          char sim= 'A' ;
          // I have iphone 10 from apple
        System.out.println("I have " +model+" from "+ brand);
// It came in the color black and it has 128 GB
        System.out.println("It is came in the color " +color+" and it has "+storage+" GB");

//for the sim type with a camera the total price was $

        System.out.println("For the sim type " +sim);



    }
}
