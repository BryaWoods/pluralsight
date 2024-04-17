package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine().trim();

        System.out.print("Billing Zip: ");
        String billingZipCode = scanner.nextLine().trim();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine().trim();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine().trim();

        System.out.print("Shipping Zip: ");
        String shippingZipCode = scanner.nextLine().trim();

        StringBuilder addresses = new StringBuilder();

        addresses.append(" ").append("\n");
        addresses.append(fullName).append("\n\n");

        addresses.append("Billing Address: \n");
        addresses.append(billingStreet).append("\n");
        addresses.append(billingCity).append(", ");
        addresses.append(billingState).append(" ");
        addresses.append(billingZipCode).append("\n\n");
        addresses.append("Shipping Address: \n");
        addresses.append(shippingStreet).append("\n");
        addresses.append(shippingCity).append(", ");
        addresses.append(shippingState).append(" ");
        addresses.append(shippingZipCode);

        String result = addresses.toString();
        System.out.println(result);

    }
}
