package day05_varaiables;

public class School {

    /*class name:
    declara and  assign these varuable
    number of students in grade 1
     number of students in grade 2
     number of students in grade 3
     number of students in grade 4
     number of students in grade 5
      total number of students in your school
      number of days in a year (have some half day = 100.5)
      number of snow days in a year (double)
      average gpa in school (3.3) [ranges 1.0- 4.0]
      print all of the variables with unique message

     */

    public static void main(String[] args) {
int numberOfStudents1=40;
int numberOfStudents2=30;
int numberOfStudents3=35;
int numberOfStudents4=50;
int numberOfStudents5=44;

int totalNumberOfStudents =numberOfStudents1 +numberOfStudents2 +numberOfStudents3 +numberOfStudents4 +numberOfStudents5;
double numberOfDaysInYears=100.5;
double numberOfSnowDays=5.5;
double averageGpaIn =3.3;
System.out.println("Number of students in Grade 1 =  " + numberOfStudents1);
System.out.println("Number of students in Grade 2 =  " + numberOfStudents2);
System.out.println("Number of students in Grade 3 =  " + numberOfStudents3);
System.out.println("Number of students in Grade 4 =  " + numberOfStudents4);
System.out.println("Number of students in Grade 5 =  " + numberOfStudents5); System.out.println("\nTotal number of Students "+ totalNumberOfStudents);

        System.out.println();
        System.out.println("Number of Days in year: "+ numberOfDaysInYears );

        System.out.println("Number of Snow days: " + numberOfSnowDays);

        System.out.println("Average GPI in school: " + averageGpaIn);
 {

}
        ;





    }
}
