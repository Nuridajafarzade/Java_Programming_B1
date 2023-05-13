package day42_collection;

import java.util.ArrayList;
import java.util.Iterator;
public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String>list= new ArrayList<>();
        list.add("James");
        list.add("Gosling");
        list.add("Java");
        System.out.println(list);


        Iterator<String>it = list.iterator();

        //  it.next();
        System.out.println(it.next());//move the pin/cursor to beginning of the next element and get that element
        System.out.println(it.next());//move the pin/cursor to beginning of the next element and get that element
        System.out.println(it.next());








    }
}
