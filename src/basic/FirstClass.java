package basic;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("This is top score");
        }

        int secondTopScore = 70;

        if (secondTopScore < topScore && topScore < 100) {
            System.out.println("This is second top score.");
        }

        int age = 25;

        if (age > 10 || age < 100) {
            System.out.println("This is healthy human");
        }

        int val = 50;
        if (val == 50) {
            System.out.println("Value is 50");
        }

        boolean isChild = false;
        if (isChild) {
            System.out.println("This is child");
        }


        boolean isAdult = (age > 18);
        System.out.println("isAdult=" + isAdult);
    }
}
