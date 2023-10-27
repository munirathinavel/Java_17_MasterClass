package basic;

public class DigitSum {

    public int digitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
