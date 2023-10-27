package basic;

public class Operators {
    public static void main(String[] args) {
        double val1 = 20.00;
        double val2 = 80.00;
        double result = (val1 + val2) * 100.00;
        System.out.println("Result =" + result);
        double remainder = result % 40.00;

        boolean isRemainderZero = remainder == 0.00 ? true : false;

        System.out.println("isRemainderZero=" + isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("got some remainder");
        }
    }
}
