package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        //This is a basic calculator for gorgeous girls who play ROBLOX//

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hey gorgeous! Enter your first number here:");
        double num1 = myScanner.nextInt();

        System.out.println("Perfect babe! Now enter your second number here:");
        double num2 = myScanner.nextInt();

        double calcA = num1 + num2;
        double calcS = num1 - num2;
        double calcM = num1 * num2;
        double calcD = num1 / num2;



        myScanner.nextLine();
        
        

        System.out.println("You're doing amazing sweetie! Now choose a calculation for this personally curated list of calculations!");
        System.out.println("Enter A for addition");
        System.out.println("Enter S for subtraction");
        System.out.println("Enter M for multiplication");
        System.out.println("Enter D for division");

        String option = myScanner.nextLine();

        switch (option) {
            case "A":
                System.out.println("Thanks for choosing addition girlie! " + num1 + " + " + num2 + " = " + calcA);
                break;
            case "S":
                System.out.println("Thanks for choosing subtraction girlie! " + num1 + " - " + num2 + " = " + calcS);
                break;
            case "M":
                System.out.println("Thanks for choosing multiplication girlie! " + num1 + " * " + num2 + " = " + calcM);
                break;
            case "D":
                System.out.println("Thanks for choosing division girlie! " + num1 + " / " + num2 + " = " + + calcD);
                break;
        }


    }





}

