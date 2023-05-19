package day44_map;
/*
StringBuffer
 It is also an object that represent of sequence of Characters
 It is also MUTABLE , once the object is created Can be modified
 StringBuffer is synchronized-thread safe
        We can create StringBuffer only by "new" keyword.
        It is also coming from java.lang package

 */
public class StringBufferPractice {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Test");
        System.out.println(stringBuffer.capacity());

        stringBuffer.indexOf("st");
        System.out.println(stringBuffer);

        stringBuffer.append("ststststst");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.lastIndexOf("st"));

        stringBuffer.reverse();
        System.out.println(stringBuffer);


    }
}
