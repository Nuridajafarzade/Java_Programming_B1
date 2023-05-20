package day45_collection_recap;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {

        //Create a hasMap (String, Double) and key - value

        Map<String,Double> map=new HashMap<>();
        map.put("James",70_000.0);  //put() acts same as the
        map.put("Gosling",124_000.0);
        map.put("Tom",140_000.0);
        map.put("Jerry",121_000.0);
        map.put("Vinnie",139_000.0);


        //Can I change it to TreeMap?
        //We can change it nut the sorting will happen based on the key, which will not help us

        //Can I chane it is TreeSet?
        //For this we need to loop though and add all the salaries into of the Collection (especially the TreeSet and get the last one)


        //Can you find the MAX and MIN  salary from the map?
        //Can you find the MIN and MAX  salary from the map?

        double maxSalary=0.0;
        double minSalary=Double.MAX_VALUE;//How can we get the MAX number that the double can hold?
        String nameForLowest ="";
        String nameForHighest= "";

        //Loop though
        //BY looping though the values ONLY, can I find the name og the max and min?
        //By looping through only values, will help us to work JUST with the values
        for (Double each : map.values()) {


        }
        //The get access to key and the values for this task, we can iterate through keys
        for (String eachKey : map.keySet()) {

            //How do I get the value for the given KEY
            Double value = map.get(eachKey); //we use this get method o read the value by the key

            if(value > maxSalary){
                maxSalary = value;
                nameForHighest = eachKey;

            }
             if (value<minSalary){
                 minSalary=value;
                 nameForLowest=eachKey;
             }
        }
        System.out.println("Name For Highest = " + nameForHighest+
                "\nLowest salary = " +minSalary);
        System.out.println("Name For Lowest = " + nameForLowest+
                "\nHighest Salary = "+ maxSalary);

        //Can you print the salary and the name for those whose salary is over 120_000.00
        // and dd %10 into their salary before printing
        double salary = 120_000.00;
        for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() > salary) {
                System.out.println("Name:" + eachEntry.getKey());
                System.out.println("\tSalary: " + eachEntry.getValue());
                System.out.println("\tAfter Increase Salary: " + eachEntry.getValue()*1.1);
                System.out.println();
            }
        }

        //Can you update the salary for each person to be %20 increased
        // Option 1
        for (String eachKey : map.keySet()) {
            map.put(eachKey, map.get(eachKey)*1.2);
        }

        // Option 2
        for (Map.Entry<String, Double> each : map.entrySet()) {
            map.put(each.getKey(), each.getValue()*1.2);
        }





    }


}




