package day39_a_polymorphism.book;

public class JavaTextbook extends EBook {

    boolean fun;

    @Override
    public void read() {
        System.out.println("reading");

    }

    @Override
    public void download() {
        System.out.println("downloading");
    }

    @Override
    public void open() {
        System.out.println("opening");
    }
}
