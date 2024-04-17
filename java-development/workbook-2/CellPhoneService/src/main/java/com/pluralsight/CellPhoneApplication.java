package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your cell phone information.\n");

        System.out.print("What is the serial number? ");
        long userSerial = scanner.nextLong();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String userModel = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String userCarrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String userPhoneNum = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String userOwner = scanner.nextLine();

        cellPhone1.setSerialNumber(userSerial);
        System.out.println("Serial number: " + cellPhone1.getSerialNumber());

        cellPhone1.setModel(userModel);
        System.out.println("Model: " + cellPhone1.getModel());

        cellPhone1.setCarrier(userCarrier);
        System.out.println("Carrier: " + cellPhone1.getCarrier());

        cellPhone1.setPhoneNumber(userPhoneNum);
        System.out.println("Phone number: " + cellPhone1.getPhoneNumber());

        cellPhone1.setOwner(userOwner);
        System.out.println("Owner: " + cellPhone1.getOwner());

    }
}
