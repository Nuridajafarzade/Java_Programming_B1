package day05_tasks;

public class EmloyeeInfo {
    public static void main(String[] args) {
      String firstName= "James";
       String lastName="Bond";
      char gender = 'M';
      int age= 40;
      String companyName="MI6";
      boolean areTheFullTime=true;
      int salary =1000000;
      int numberOfPto=15;
      boolean areTheyMarried=false;
      char suite ='D';
 System.out.println("Employment information for "+lastName+"\t"+firstName);
        System.out.println("Gender: "+gender);
        System.out.println("Special Agent at "+companyName);
        System.out.println("Currently "+age+ " years old");
        System.out.println("MI6 is located in suite "+ suite);
        System.out.println("This year salary comes to $ "+salary);
        System.out.println("Other details:");
        System.out.println("\tPTO: " +numberOfPto);
        System.out.println("\tFull time? " +areTheFullTime);
      System.out.println("\tMarreied? "+areTheyMarried);

    }
}
