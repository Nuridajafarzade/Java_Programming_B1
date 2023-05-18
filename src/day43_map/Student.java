package day43_map;

public class Student {
/*
    Declare 3 instance variables: name, gp, id
    Create a constructor that accepts 3 arguments and initialize using them in constructor.
    Make a toString method to String the info about object.
 */

    String name;
    double gpa;
    int id;

    public Student(String name, double gp, int id) {
        this.name = name;
        this.gpa = gp;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student" +
                "\nname='" + name +
                "\ngp='" + gpa +
                "\nid=" + id;
    }
}

