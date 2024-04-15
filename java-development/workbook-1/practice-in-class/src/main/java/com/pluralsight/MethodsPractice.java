package com.pluralsight;

import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {


        /*kdot();
        kungFuKenny();*/
        Scanner myScanner =new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber =myScanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = myScanner.nextInt();

        int sumFromFunction = addAndDisplay(firstNumber, secondNumber);

        System.out.printf("%d + %d + %d" , firstNumber, secondNumber, sumFromFunction);


    }

    /*public static void kdot() {
        System.out.println("Kendrick");
        System.out.println("Lamar");


    }*/

   /* public static void kungFuKenny() {
        System.out.println("Greatest rapper alive");
        System.out.println("Big 3? It's just big me.");
    }*/

    public static int addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        return sum;


    }
}
