package oops.inheritance.methodoverloading;

public class MethodOverloading {
    public void method() {
        System.out.println("public  void method()");
    }

    public void method(int param1) {
        System.out.println("public  void method(int param1):" + param1);
    }

    public void method(float param1) {
        System.out.println("public  void method(float param1):" + param1);
    }

    public void method(int param1, float param2) {
        System.out.println(" public  void method(int param1, float param2):" + param1 + ", " + param2);
    }

    public void method(float param1, int param2) {
        System.out.println("public  void method(float param1, int param2):" + param1 + " , " + param2);
    }

    public void method(int param1, int parama2, int param3) {
        System.out.println("public void method(int param1, int parama2, int param3):" + param1 + ", " + parama2 + ", " + param3);
    }
}
