package basic;

public class WhileLoop {

    public static void main(String[] args) {
        int i = 5;
        int count = 0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                count++;
            }
            if (count == 5) {
                break;
            }
            i++;
        }
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0 ? true : false;
    }
}
