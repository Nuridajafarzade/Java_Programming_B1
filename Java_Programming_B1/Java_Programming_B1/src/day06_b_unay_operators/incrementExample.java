package day06_b_unay_operators;

public class incrementExample {

    public static void main(String[] args) {

   int x = 0;
        System.out.println(x); //0

        x=4;
        System.out.println(x); //4
        x=x+1;
        System.out.println(x); //5
        x++; // post increment x =x+1;
        System.out.println(x); //6
        ++x;//pre increment
        System.out.println(x); //7
        System.out.println(x++); // ---> statement us run first because it is a post increment
        System.out.println(x);//8
        System.out.println(++x); //9 --->because it is pre increment it wiil add 1 right away




    }
}
