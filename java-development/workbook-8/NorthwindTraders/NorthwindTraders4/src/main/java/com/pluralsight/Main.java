package com.pluralsight;

import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String username;
    private static String password;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.pluralsight.UsingDriverManager <username> <password>");
            System.exit(1);
        }

        username = args[0];
        password = args[1];


        Class.forName("com.mysql.cj.jdbc.Driver");




        homeScreenMenu();

    }

    public static void homeScreenMenu() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customers");
            System.out.println("3) Display all categories");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");


            try {

                int option = scanner.nextInt();
                scanner.nextLine();


                switch (option) {
                    case 1:
                        displayAllProducts();
                        break;
                    case 2:
                        displayAllCustomers();
                        break;
                    case 3:
                        displayAllCategories();
                    case 0:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }

        }
    }

    public static void displayAllProducts() {

        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        username,
                        password
                );

                PreparedStatement preparedStatement =
                        connection.prepareStatement("""
                                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                                FROM Products
                                ORDER BY ProductID;
                                """);


                ResultSet results = preparedStatement.executeQuery();
        ) {

            String[] headers = {"Id", "Name", "Price", "Stock"};

            List<Object[]> rows = new ArrayList<>();

            while (results.next()) {
                int id = results.getInt("ProductID");
                String products = results.getString("ProductName");
                double price = results.getDouble("UnitPrice");
                int stock = results.getInt("UnitsInStock");

                rows.add(new Object[]{id, products, price, stock});
            }

            int[] columnWidths = {5, 35, 15, 10};

            for (int i = 0; i < headers.length; i++) {
                System.out.printf("%-" + columnWidths[i] + "s", headers[i]);
            }
            System.out.println();


            for (int i = 0; i < headers.length; i++) {
                System.out.printf("%-" + columnWidths[i] + "s", "-".repeat(columnWidths[i] - 1));
            }
            System.out.println();

            for (Object[] row : rows) {
                for (int i = 0; i < row.length; i++) {
                    System.out.printf("%-" + columnWidths[i] + "s", row[i]);
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void displayAllCustomers(){

        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        username,
                        password
                );

                PreparedStatement preparedStatement =
                        connection.prepareStatement("""
                                SELECT ContactName, CompanyName, City, Country, Phone
                                FROM Customers
                                ORDER BY Country;
                                """);


                ResultSet results = preparedStatement.executeQuery();
        ) {

            String[] headers = {"Name", "Company", "City", "Country", "Phone"};

            List<Object[]> rows = new ArrayList<>();

            while (results.next()) {
                String name = results.getString("ContactName");
                String company = results.getString("CompanyName");
                String city = results.getString("City");
                String country = results.getString("Country");
                String phone = results.getString("Phone");

                rows.add(new Object[]{name, company, city, country, phone});
            }

            int[] columnWidths = {25, 38, 25, 20, 20};

            for (int i = 0; i < headers.length; i++) {
                System.out.printf("%-" + columnWidths[i] + "s", headers[i]);
            }
            System.out.println();


            for (int i = 0; i < headers.length; i++) {
                System.out.printf("%-" + columnWidths[i] + "s", "-".repeat(columnWidths[i] - 1));
            }
            System.out.println();

            for (Object[] row : rows) {
                for (int i = 0; i < row.length; i++) {
                    System.out.printf("%-" + columnWidths[i] + "s", row[i]);
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
    public static void displayAllCategories() {

        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        username,
                        password
                );

                PreparedStatement preparedStatement =
                        connection.prepareStatement("""
                                SELECT CategoryID, CategoryName
                                FROM Categories
                                ORDER BY CategoryID;
                                """);


                ResultSet results = preparedStatement.executeQuery();
        ) {

            String[] headers = {"Id", "Categories"};

            List<Object[]> rows = new ArrayList<>();

            while (results.next()) {
                int id = results.getInt("CategoryID");
                String name = results.getString("CategoryName");


                rows.add(new Object[]{id, name});
            }

            int[] columnWidths = {5, 20};

            for (int i = 0; i < headers.length; i++) {
                System.out.printf("%-" + columnWidths[i] + "s", headers[i]);
            }
            System.out.println();


            for (int i = 0; i < headers.length; i++) {
                System.out.printf("%-" + columnWidths[i] + "s", "-".repeat(columnWidths[i] - 1));
            }
            System.out.println();

            for (Object[] row : rows) {
                for (int i = 0; i < row.length; i++) {
                    System.out.printf("%-" + columnWidths[i] + "s", row[i]);
                }
                System.out.println();
            }

            categoryScreenMenu();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void categoryScreenMenu() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Enter a category ID");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");


            try {

                int option = scanner.nextInt();
                scanner.nextLine();


                switch (option) {
                    case 1:
                        displayProductMatch();
                        break;
                    case 3:
                        displayAllCategories();
                    case 0:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }

        }
    }
    public static void displayProductMatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Category ID: ");
        int userID = scanner.nextInt();

        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        username,
                        password
                );

                PreparedStatement preparedStatement =
                        connection.prepareStatement("""
                                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                                FROM Products p
                                JOIN Categories c
                                ON p.CategoryID = c.CategoryID
                                WHERE p.CategoryID = ? ;
                                """);

        ){
            preparedStatement.setInt(1, userID);

            try(ResultSet results = preparedStatement.executeQuery()) {


                String[] headers = {"Id", "Name", "Price", "Stock"};

                List<Object[]> rows = new ArrayList<>();

                while (results.next()) {
                    int id = results.getInt("ProductID");
                    String products = results.getString("ProductName");
                    double price = results.getDouble("UnitPrice");
                    int stock = results.getInt("UnitsInStock");

                    rows.add(new Object[]{id, products, price, stock});
                }

                int[] columnWidths = {5, 35, 15, 10};

                for (int i = 0; i < headers.length; i++) {
                    System.out.printf("%-" + columnWidths[i] + "s", headers[i]);
                }
                System.out.println();


                for (int i = 0; i < headers.length; i++) {
                    System.out.printf("%-" + columnWidths[i] + "s", "-".repeat(columnWidths[i] - 1));
                }
                System.out.println();

                for (Object[] row : rows) {
                    for (int i = 0; i < row.length; i++) {
                        System.out.printf("%-" + columnWidths[i] + "s", row[i]);
                    }
                    System.out.println();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}
