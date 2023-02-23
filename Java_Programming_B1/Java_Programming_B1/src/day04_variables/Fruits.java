package day04_variables;

public class Fruits {
    public static void main(String[] args){
        // create 3 variables called apple,grapes, bananas, --> dataType is int
        int apple= 50;
        int grapes=125;
        int bananas =150;

//lets print out "This how many apple we have"

        System.out.println("This how many apple we have:"  + apple ) ;
        System.out.println("grapes:"+ grapes);
        System.out.println("bananas:"+ bananas );
        System.out.println("");
// we gave apples 20 appels to a friend
        apple = 30;
        System.out.println("apple left:"+ apple);
// declare new variable called price  assing a value 20.0
        double  price = 20.0;
        // Write statement :"The price for 100 grapes is $20.0"
        System.out.println("The price for 100 grapes is $20.0" ); //hard coded
        System.out.println("The price for"+grapes+"grapes is $ " +price);//dnamic


    }
}
