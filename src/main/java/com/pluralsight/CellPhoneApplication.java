package com.pluralsight;

import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        System.out.print("Enter the serial number: ");
        int serialNumber = Integer.parseInt(scanner.nextLine());
        cellPhone.setSerialNumber(serialNumber);

        System.out.print("Enter the model: ");
        String model = scanner.nextLine();
        cellPhone.setModel(model);

        System.out.print("Enter the carrier: ");
        String carrier = scanner.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);

        System.out.print("Enter the owner: ");
        String owner = scanner.nextLine();
        cellPhone.setOwner(owner);

        System.out.println("Phone Information:");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

        scanner.close();
    }
}
