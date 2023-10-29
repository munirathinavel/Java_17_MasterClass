package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] arr1 = getRandomArray(10);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] array2 = new int[10];
        System.out.println(Arrays.toString(array2));
        Arrays.fill(array2, 7);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        int[] array3 = getRandomArray(10);
        System.out.println(Arrays.toString(array3));
        int[] copiedArray = Arrays.copyOf(array3, array3.length);
        System.out.println(Arrays.toString(copiedArray));
        System.out.println();
        Arrays.sort(copiedArray);
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(copiedArray));
        int[] smallArray = Arrays.copyOf(array3, 5);
        System.out.println(Arrays.toString(smallArray));
        int[] bigArray = Arrays.copyOf(array3, 15);
        System.out.println(Arrays.toString(bigArray));




    }

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i =0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
