package day08_scanner_logical_operators;

public class Discount {


    public static void main(String[] args) {


/*


        declare and assign
        is it the weekend
        are you a teacher
        are you a police officer
        are you a firefighter

        Do you get a discount?
  Must be a weekend day and you must be one of the given professions

*/

boolean isItTheWeekwnd =true;
boolean isATeacher = false;
boolean isPoliceOfficer =false;
boolean isFireFighter= false;
 boolean getsDiscount;

 getsDiscount = isItTheWeekwnd && (isATeacher || isPoliceOfficer ||isFireFighter);


        System.out.println(getsDiscount);








    }
}
