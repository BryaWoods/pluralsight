package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {

        String line;
        String cvsSplitBy = "\\|";


        try {
            //FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(new FileReader("employees.csv"));


            while((line = bufReader.readLine()) != null) {

                String[] tokens = line.split(cvsSplitBy);
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());



            }

            bufReader.close();




        } catch (IOException e) {
            System.out.println("Error reading file");

        }


    }
}
