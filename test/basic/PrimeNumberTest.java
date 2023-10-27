package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void isPrime() {
        long totalTime = 0;
        for (int j = 0; j < 5; j++) {
            long startTime = System.currentTimeMillis();
            PrimeNumber primeNumber = new PrimeNumber();
//            System.out.println("Prime Numbers:");
            for (int i = 0; i < 100000; i++) {
                boolean result = primeNumber.isPrime(i);
//                if (result) {
//                    System.out.print(i + " ");
//                }
            }
            totalTime += (System.currentTimeMillis() - startTime);
        }

        System.out.println("\nAverage time taken:" + (totalTime / 5) + " ms");
    }
}