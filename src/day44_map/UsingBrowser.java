package day44_map;

public class UsingBrowser {
    public static void main(String[] args) {

     Browser browser= Browser.CHROME;


     switch (browser){
         case EDGE:
             System.out.println("Opining Edge browser");
             break;

         case CHROME:
             System.out.println("Opining Chrome browser");
             break;

         case SAFARI:
         System.out.println("Opining Safari browser");
         break;

         case FIREFOX:
             System.out.println("Opining Firefox browser");
             break;
     }



    }
}
