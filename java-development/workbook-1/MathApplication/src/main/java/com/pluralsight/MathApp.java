package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
       // Question 1//

        double bobSalary = 50250;
        double garySalary = 28280;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary);

        // Question 2//

        double carPrice = 180000.00f;
        double truckPrice = 20000.00f;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The smallest variable is $" + lowestPrice);

        //Question 3//

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

        //Question 4//

        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + "is " + sqrtNum1);

        //Question 5//

        double x1 = 5;
        double y1 = 10;

        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

        //Question 6//

        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("The absolute value of " + num2 + "is" + absNum2);

        //Question 7//

        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);


    }
}