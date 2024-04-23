package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        String cvsSplitBy = "\\|";

        System.out.println("Enter the name of the file employee file to process: ");
        String fileName = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to create: ");
        String fileName2 = scanner.nextLine();





        try {
            //FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
            FileWriter fileWriter = new FileWriter(fileName2 + ".csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            while((line = bufReader.readLine()) != null) {

                String[] tokens = line.split(cvsSplitBy);
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                String formattedData = String.format("%d|%s|$%.2f%n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

                bufferedWriter.write(formattedData);


                //System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());



            }

            bufferedWriter.close();

            bufReader.close();




        } catch (IOException e) {
            System.out.println("Error reading file");

        }


    }
}
