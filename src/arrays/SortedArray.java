package arrays;

import java.util.*;

public class SortedArray {
    public static int[] getIntegers(int n) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[n];
        for(int i =0; i < n;i++) {
            arr[i] =  Integer.parseInt(sc.nextLine());
        }
        return arr;
    }
    
    public  static void printArray(int[] arr) {
        for(int i =0 ; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
    
    public  static  int[] sortIntegers(int[] arr) {
        int n = arr.length;
        int[] result = Arrays.copyOf(arr, n);
        
        for(int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if( result[i] < result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        System.out.println("Original Array:");
        printArray(array);

        int[] result = sortIntegers(array);
        System.out.println("Sorted Array:");
        printArray(result);

        int[] a1 = new int[5];
        int[] a2 = a1;
        a2[1] = 123;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

     }
}
    
 