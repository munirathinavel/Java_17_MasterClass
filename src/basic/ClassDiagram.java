package basic;

interface B {
    final static String CITY = "Bangalore";

    void m1();

    default void m2() {
        System.out.println("m2");
    }
}

public class ClassDiagram {
    public static void main(String[] args) {
        System.out.println(B.CITY);

    }
}
