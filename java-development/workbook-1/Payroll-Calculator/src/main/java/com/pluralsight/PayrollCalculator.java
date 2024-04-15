package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter yor freaking name dummy!!! ");
        String name = myScanner.nextLine();

        System.out.println("How many freaking hours did you work dummy?!");
        double hours = myScanner.nextDouble();

        myScanner.nextLine();

        System.out.println("What is yor freaking pay rate you dumb idiot?!");
        double payRate = myScanner.nextDouble();

        double grossPay = hours * payRate;

        System.out.println("Okay idiot " + name + " your freaking gross pay is $" + grossPay);
        System.out.println("Happy now?!?");
        System.out.println("If you're satisfied please leave ☆☆☆☆☆ ");
        myScanner.nextLine();
        String stars = myScanner.nextLine();

        System.out.println("Thank you, now leave!!!");

    }
}
