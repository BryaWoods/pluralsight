package com.pluralsight;

public class Employee {
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private  double hoursWorked;

    public Employee(String employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getTotalPay() {
        double regularHours = getRegularHours();
        double overtimeHours = getOvertimeHours();


        double regularPay = regularHours * payRate;


        double overtimePay = overtimeHours * (payRate * 1.5);


        double totalPay = regularPay + overtimePay;

        return totalPay;


    }
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }

    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }

    }
}
