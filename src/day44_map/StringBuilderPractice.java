package day44_map;
/*
     StringBuilder
     It is also an object representation of sequence of characers
     StringBuilder is mutable and CAN be modified
     It is Not synchronized - Not thead sage
     we
     can ONLY creat object of StringBuilder by the "new" keyword
     It is coming from java.lang package

 */
public class StringBuilderPractice {
    public static void main(String[] args) {

        StringBuilder stringBuilder= new StringBuilder("Hello");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        stringBuilder.append(2);
        System.out.println(stringBuilder);

        stringBuilder.append("olleH");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,5);
        System.out.println(stringBuilder);

        stringBuilder.insert(1,"Test");
        System.out.println(stringBuilder);

        stringBuilder.replace(5,7,"----");
        System.out.println(stringBuilder);





    }
}
