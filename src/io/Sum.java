package io;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        do {
            System.out.println("Enter number #" + i + ":");
            try {
                String val = sc.nextLine();
                sum += Integer.parseInt(val);
                i++;
            } catch (Exception e) {
                System.out.println("Invalid Number");
            }

        } while (i <= 5);

        System.out.println("Sum of 5 numbers is " + sum);
    }
}
