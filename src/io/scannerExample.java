package io;

import java.util.Scanner;

public class scannerExample {

    public static void main(String[] args) {
        calculateAge();
    }

    public static void calculateAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name:");
        String name = scanner.nextLine();
        System.out.println("Your year of Birth:");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Hi " + name + "! Your age is " + (2023 - yearOfBirth));
    }
}
