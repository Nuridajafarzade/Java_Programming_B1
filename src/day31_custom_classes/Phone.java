package day31_custom_classes;

public class Phone {

    String name;
    String brand;
    int memory;
    double version;

    public Phone(String name){
        this.name= name;


    }
    public Phone(String name,String brand) {
        this.name = name;
        this.brand = brand;
    }
    public Phone(String name,String brand,int memory) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
    }
    public Phone(String name,String brand,int memory,double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version= version;
    }

//    @Override
//    public String toString() {
//        return "Phone: " +
//                "\nname: " + name +
//                "\nbrand: " + brand +
//                "\nmemory: " + memory +
//                "\nversion: " + version;
//    }
// This is if we want to customize our toString() method.
@Override
public String toString() {
    String result = name;

    if (brand == null) {
        result += "\nBrand: Will be determined";
    } else {
        result += "\nBrand: " + brand;
    }

    if (memory == 0 ) {
        result += "\nMemory: Will be determined";
    } else {
        result += "\nMemory: " + memory;
    }

    if (version == 0.0) {
        result += "\nVersion: Will be determined";
    }else {
        result += "\nVersion: " + version;
    }

    return result;

}
}
