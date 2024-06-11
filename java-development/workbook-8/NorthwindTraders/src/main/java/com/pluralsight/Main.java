package com.pluralsight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.pluralsight.UsingDriverManager <username> <password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                username,
                password
                );


        PreparedStatement preparedStatement =
                connection.prepareStatement( """
                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                FROM Products
                ORDER BY ProductID;
                """);




        ResultSet results = preparedStatement.executeQuery();

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



        connection.close();
    }
}
