package basic;

public class PrimitiveTypes {

    public static void main(String[] args) {
        System.out.println("Byte min:" + Byte.MAX_VALUE + ", max:" + Byte.MAX_VALUE);
        System.out.println("Short min:" + Short.MAX_VALUE + ", max:" + Short.MAX_VALUE);
        System.out.println("Integer min:" + Integer.MAX_VALUE + ", max:" + Integer.MAX_VALUE);
        System.out.println("Long min:" + Long.MAX_VALUE + ", max:" + Long.MAX_VALUE);
        System.out.println();

        System.out.println("Byte Size:" + Byte.SIZE);
        System.out.println("Short Size:" + Short.SIZE);
        System.out.println("Integer Size:" + Integer.SIZE);
        System.out.println("Long Size:" + Long.SIZE);

        System.out.println();

        byte byteValue = 124;
        short shortValue = 23434;
        int intValue = 4324323;
        long longVal = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println("Sum = " + longVal);
        System.out.println();

        Result result = getResult(45);
        System.out.println("Pound: " + result.pounds() + " is equal to: " + result.kilograms() + " kilograms");

        result = getResult(100);
        System.out.println("Pound: " + result.pounds() + " is equal to: " + result.kilograms() + " kilograms");

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("My values are:" + mySimpleChar + ", " + myUnicodeChar + ", " + myDecimalChar);

        boolean isOver21 = true;
        boolean isMarried = true;
        boolean hasUSVisa = false;
        System.out.println("Boolean values are:" + isOver21 + ", " + isMarried + ", " + hasUSVisa);

    }

    private static Result getResult(double pounds) {
        double kilograms = pounds * 0.45359237;
        Result result = new Result(pounds, kilograms);
        return result;
    }

    private record Result(double pounds, double kilograms) {
    }
}
