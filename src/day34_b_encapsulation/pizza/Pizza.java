package day34_b_encapsulation.pizza;

public class Pizza {
    // Private date: size ,

    private  String size;
    private  int numOfTopping;

    //Constructor : accepts 2 arg
    // if size is(small, medium, large)
    //if numOfTopping > 0
    public Pizza (String size, int numOfToppings){
        setSize(size);
        setNumOfToppings(numOfToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("medium")  ||
                size.equalsIgnoreCase("small")   ||
                size.equalsIgnoreCase("large")){

            this.size = size;
        } else {
            System.out.println("Not correct size");
        }
    }

    public int getNumOfToppings() {
        return numOfTopping;
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings > 0) {
            this.numOfTopping = numOfToppings;
        } else {
            System.out.println("The number can not be less than 0");
        }

    }



    //make a method to calculatePrice
    // if small = $10
    // if medium = $12
    // if large = $14
    // each topping = $0.5
    public double calculatePrice () {
        double price = 0;
        if (size.equalsIgnoreCase("small")) {
            price = 10 + (numOfTopping *0.5);
        } else if (size.equalsIgnoreCase("medium")){
            price = 12 + (numOfTopping *0.5);
        } else if (size.equalsIgnoreCase("large")){
            price = 14 + (numOfTopping *0.5);
        }

        return price;
    }


    public String toString(){
        return "Pizza size: " + size + ", number of toppings " + numOfTopping + ". Total price $" + calculatePrice();
    }
}
