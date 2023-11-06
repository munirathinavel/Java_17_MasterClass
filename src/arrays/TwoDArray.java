package arrays;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        array[2] = new int[]{1,2,3};
        System.out.println(Arrays.deepToString(array));
        System.out.println(array.length);
        System.out.println(array[0].length);

        int[][] array2 = {{1,2,3}, {4,5,6}, {755,833,922}};
        for (var arr: array2) {
            for (var val: arr) {
                System.out.printf("%4d ", val);
            }
            System.out.println();
        }
    }
}
