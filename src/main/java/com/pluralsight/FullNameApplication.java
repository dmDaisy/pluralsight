package com.pluralsight;

import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        StringBuilder fullName = new StringBuilder(firstName);

        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }

        fullName.append(" ").append(lastName);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        System.out.println("Full name: " + fullName);

        scanner.close();
    }
}
