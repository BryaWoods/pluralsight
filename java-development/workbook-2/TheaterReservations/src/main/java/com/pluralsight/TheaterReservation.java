package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("What date will you be coming (MM/dd/yyyy):");
        String showDateStr = scanner.nextLine().trim();

        System.out.print("How many tickets would you like?");
        int numTickets = scanner.nextInt();
        scanner.nextLine();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(showDateStr, dateFormatter);

        int spaceIndex = name.lastIndexOf(' ');

        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex +1);


        String ticketPlural = (numTickets == 1) ? "ticket" : "tickets";
        System.out.println(numTickets + " " + ticketPlural + " reserved for " + showDate + " under " + lastName + ", " + firstName);

        scanner.close();



    }
}