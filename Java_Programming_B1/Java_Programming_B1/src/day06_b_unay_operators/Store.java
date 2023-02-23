package day06_b_unay_operators;

public class Store {
    public static void main(String[] args) {

       String store = "Target";
               int numberOfTv= 100;

        System.out.println("I have a total of "+ numberOfTv+ " tvs");
        System.out.println("Person comes i  nto the store and they bout one tv");
        System.out.println("Number of tv left in the store: "+--numberOfTv);
        System.out.println("Another person comes into store and puts the tv into his cart");
        System.out.println("Available Tv in store: "+ numberOfTv--);
        System.out.println("The same person who had the Tv in his cart bougth the  TV "  );
        System.out.println("Now we have TV in total  " + numberOfTv);
    }
}
