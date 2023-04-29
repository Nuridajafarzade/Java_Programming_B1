package day33_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {

       TrafficLight light = new TrafficLight("yellow");

        //System.out.println(light.color);
       // light.color = "red";


        TrafficLight light1 = new TrafficLight("grey");

        System.out.println(light1.getColor()); //


        TrafficLight light3 = new TrafficLight("Green");
        System.out.println(light3.getColor()); //


    }



    }

