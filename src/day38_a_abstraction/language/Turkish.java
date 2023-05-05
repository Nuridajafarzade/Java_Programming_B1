package day38_a_abstraction.language;

public class Turkish implements Language{

    @Override
    public void hi() {
        System.out.println("Meraba");

    }

    @Override
    public void bye() {
        System.out.println("Gule gule");
    }
}
