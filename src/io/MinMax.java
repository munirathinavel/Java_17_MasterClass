package io;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0, max = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter a number or character to exit:");
            String input = scanner.nextLine();
            try {
                double val = Double.parseDouble(input);
                if (count == 0 || val < min) {
                    min = val;
                }

                if (count == 0 || val > max) {
                    max = val;
                }
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        System.out.println("Min value:" + min);
        System.out.println("Max value:" + max);
    }
}