package day33_a_static;

public class BestBuy {
    // if we do not object we can not reach th instance
    String location;

    static String headQuarters = "Richfield, MN, USA";
    static String day ="Sunday";
    static int numOfComputer=100;


    public BestBuy (String location){
        this.location=location;
    }


//-------------------------------------------

    //This is an instance method which has return type as
   // Void and does not any arguments
    public void openStore(){
        System.out.println("Opening the" + location);
    }

    public static void reStock(){
        System.out.println(numOfComputer);
    }


}
