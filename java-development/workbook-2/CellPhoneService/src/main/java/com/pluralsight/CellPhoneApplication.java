package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your cell phone information.\n");

        System.out.print("What is the serial number? ");
        long userSerial = scanner.nextLong();
        cellPhone1.setSerialNumber(userSerial);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String userModel = scanner.nextLine();
        cellPhone1.setModel(userModel);

        System.out.print("Who is the carrier? ");
        String userCarrier = scanner.nextLine();
        cellPhone1.setCarrier(userCarrier);

        System.out.print("What is the phone number? ");
        String userPhoneNum = scanner.nextLine();
        cellPhone1.setPhoneNumber(userPhoneNum);

        System.out.print("Who is the owner of the phone? ");
        String userOwner = scanner.nextLine();
        cellPhone1.setOwner(userOwner);




        /*System.out.println("Serial number: " + cellPhone1.getSerialNumber());

        System.out.println("Model: " + cellPhone1.getModel());

        System.out.println("Carrier: " + cellPhone1.getCarrier());

        System.out.println("Phone number: " + cellPhone1.getPhoneNumber());

        System.out.println("Owner: " + cellPhone1.getOwner());

        System.out.println("");*/

       //CellPhone 2

        System.out.println("\n" + "Please Enter your cell phone information.\n");

        System.out.print("What is the serial number? ");
        userSerial = scanner.nextLong();
        cellPhone2.setSerialNumber(userSerial);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        userModel = scanner.nextLine();
        cellPhone2.setModel(userModel);

        System.out.print("Who is the carrier? ");
        userCarrier = scanner.nextLine();
        cellPhone2.setCarrier(userCarrier);

        System.out.print("What is the phone number? ");
        userPhoneNum = scanner.nextLine();
        cellPhone2.setPhoneNumber(userPhoneNum);

        System.out.print("Who is the owner of the phone? ");
        userOwner = scanner.nextLine();
        cellPhone2.setOwner(userOwner);




        /*System.out.println("Serial number: " + cellPhone2.getSerialNumber());

        System.out.println("Model: " + cellPhone2.getModel());

        System.out.println("Carrier: " + cellPhone2.getCarrier());

        System.out.println("Phone number: " + cellPhone2.getPhoneNumber());

        System.out.println("Owner: " + cellPhone2.getOwner());*/


        //CellPhone 3

        System.out.println("\n" + "Please Enter your cell phone information.\n");

        System.out.print("What is the serial number? ");
        userSerial = scanner.nextLong();
        cellPhone3.setSerialNumber(userSerial);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        userModel = scanner.nextLine();
        cellPhone3.setModel(userModel);

        System.out.print("Who is the carrier? ");
        userCarrier = scanner.nextLine();
        cellPhone3.setCarrier(userCarrier);

        System.out.print("What is the phone number? ");
        userPhoneNum = scanner.nextLine();
        cellPhone3.setPhoneNumber(userPhoneNum);

        System.out.print("Who is the owner of the phone? ");
        userOwner = scanner.nextLine();
        cellPhone3.setOwner(userOwner);



        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone3.dial(cellPhone3.getPhoneNumber());

        System.out.println("\n");

        display(cellPhone1);
        System.out.println("\n");
        display(cellPhone2);
        System.out.println("\n");
        display(cellPhone2);



    }
    public static void display(CellPhone phone) {

        System.out.println("Serial number: " + phone.getSerialNumber());

        System.out.println("Model: " + phone.getModel());

        System.out.println("Carrier: " + phone.getCarrier());

        System.out.println("Phone number: " + phone.getPhoneNumber());

        System.out.println("Owner: " + phone.getOwner());

    }
}
