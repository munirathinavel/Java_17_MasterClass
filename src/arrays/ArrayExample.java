package arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.printf("number[0]" + numbers[0]);

        int[] nums1 = new int[] {1,2,3,4,5};
        for (int i =0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
        System.out.println();
        int[] nums2 = {1,2,3,4,5};
        for (int i =0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
        System.out.println("\n For each now");
        for(int num: nums2) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(nums2));

        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(matrix));

        if (nums2 instanceof  int[]) {
            System.out.println("This object is an int array");
        }

        Object[] objects = new Object[5];
        objects[0] = "Hello";
        objects[1] = 4;
        objects[2] = new int[]{1, 2, 3, 4, 5};
        objects[3] = new StringBuilder("World!");
        objects[4] = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println();
        for (Object obj: objects) {
            if (obj instanceof int[]) {
                System.out.println(Arrays.toString((int[])obj));
            } else if (obj instanceof int[][]) {
                System.out.println(Arrays.deepToString((int[][])obj));
            }else {
                System.out.println(obj);
            }
        }


    }
}
