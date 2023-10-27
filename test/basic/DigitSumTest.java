package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumTest {

    @Test
    void digitSum() {

        DigitSum digitSum = new DigitSum();
        assertEquals(8, digitSum.digitSum(125));
        assertEquals(8, digitSum.digitSum(3023));
        assertEquals(15, digitSum.digitSum(456));
        assertEquals(15, digitSum.digitSum(12507));
        assertEquals(-1, digitSum.digitSum(-23234));
    }

    @Test
    void sharedDigit() {
        System.out.println(hasSharedDigit(12, 13));
    }

    boolean hasSharedDigit(int number1, int number2) {
        while (number1 > 0) {
            int digit1 = number1 % 10;
            int temp = number2;
            while (temp > 0) {
                int digit2 = temp % 10;
                System.out.println("Digit1=" + digit1 + ", Digit2=" + digit2);
                if (digit1 == digit2) {
                    return true;
                }
                temp /= 10;
            }
            number1 /= 10;
        }
        return false;
    }
}
