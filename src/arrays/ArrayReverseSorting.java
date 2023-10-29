package arrays;

import java.util.Arrays;

public class ArrayReverseSorting {
    public static void main(String[] args) {
        int[] array = ArraysUtil.getRandomArray(10);
        System.out.println("Original Array:" + Arrays.toString(array));

        Arrays.sort(array, 0, array.length);
        System.out.println("Sorted Array:" + Arrays.toString(array));
        reverseSortedArray(array);
        System.out.println("Reverse Sorted Array" + Arrays.toString(array));

        int[] array2 = ArraysUtil.getRandomArray(20);
        System.out.println("Original Unsorted Array:" + Arrays.toString(array2));
        reverseUnsortedArray(array2);
        System.out.println("Reverse sorted Original Array:" + Arrays.toString(array2));
    }

    private static void reverseUnsortedArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private static void reverseSortedArray(int[] arr) {
        int n = arr.length -1;
        for (int i = 0; i < n / 2; i++) {
            swap(arr, i, n -i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
