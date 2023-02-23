package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {

     byte b = 40;
     int i =b; // the byte value is automatically (implicitly) converted to int,because byte is smaller that int.
int i2 =100;
//byte b2 = i2; // Reassigning check the type first.That is why we can not put it this way
byte b2 =(byte)i2;// Reassigning check the type first.With CASRING we can put like this
byte b3 = 100; //Putting value directly gives a data type automatically after checking the range

        System.out.println("b2: " +b2);
        System.out.println("b3: "+b3);

   int i3 = 130;
   byte b4 = (byte)i3; //-128..........127-->After casting the data type ,it check the value if it is in the rage
        System.out.println("b4 "+b4);

    }
}
