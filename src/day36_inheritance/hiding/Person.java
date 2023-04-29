package day36_inheritance.hiding;

import java.util.concurrent.Callable;

public class Person {

    String name = "Tom Jerry";

}
class Child extends Person {
    //if the instance below was comment out,
    //the object of the child class will get the name instance from Parent class
    //Since we have it and
    //we call it with the child class object,
    //the one in the Parent is hidden for Child class objec.
    String name = "Jame Gosling";
}

class  Runner {
    public static  void  main (String[] rgs){
        Person person= new Person();
        System.out.println(person.name);

        System.out.println("--------------");

        Child child= new Child();
        System.out.println(person.name);
    }
}