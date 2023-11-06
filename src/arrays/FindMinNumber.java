package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]  values = sc.nextLine().split(",");
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        System.out.println("Minimum value is:" + findMin(numbers));

        int[] a1 = new int[]{1, 2, 3, 4, 5, 6};
        reverse(a1);
        System.out.println(Arrays.toString(a1));
    }

    private static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for(int num: numbers) {
            min = Math.min(min, num);
        }
        return min;
    }

    private static void reverse(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1-i];
            arr[n - 1 -i] = temp;
        }
    }
}
