package day05_varaiables;

public class RecapVariables {
    public static void main(String[] args) {


        // Declare variables
        byte numberOfCoffeeCaps ;
        double totalPriceOfCoffee;
        int totalStudentInClass;
// we can not print the variables if they do nat have a value
  //      System.out.println(numberOfCoffeeCaps);
  //      System.out.println(totalPriceOfCoffee);
  //      System.out.println(totalStudentInClass);

        //Assign the values
        numberOfCoffeeCaps=2;
        totalPriceOfCoffee=12.21;
        totalStudentInClass=543;
        System.out.println(numberOfCoffeeCaps);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);
//2* 543
        System.out.println(numberOfCoffeeCaps+" * "+totalStudentInClass);
        // Declare and assign
        double temperature =20.6;
        int javaDays = 5;
        System.out.println("This is my temperature:"+ temperature);
        //It os day 5 in java class
        System.out.println("It is day " + javaDays +" in java day");
    }
}
