package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("This application needs a Username and Password too run!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the last name of the actor you want to search:");
        String lastNameToSearch = scanner.nextLine();

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);


        doSimpleQuery(dataSource, lastNameToSearch);

        System.out.println("===================================================================================");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");

        doJoin(dataSource, lastNameToSearch);
    }

    public static void doSimpleQuery(BasicDataSource dataSource, String lastNameToSearch) {

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     """
                             SELECT first_name, last_name
                             FROM actor
                             WHERE last_name LIKE ?
                             ORDER BY first_name;
                             """
             )) {

            preparedStatement.setString(1, lastNameToSearch);

            try (ResultSet results = preparedStatement.executeQuery()) {
                while (results.next()) {
                    String firstName = results.getString("first_name");


                    String lastName = results.getString("last_name");


                    System.out.println("FirstName: " + firstName);
                    System.out.println("LastName: " + lastName);
                    System.out.println("===============================================");

                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doJoin(BasicDataSource dataSource, String lastNameToSearch) {


        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT actor.first_name, actor.last_name, film.title " +
                             "FROM actor " +
                             "JOIN film_actor ON actor.actor_id = film_actor.actor_id " +
                             "JOIN film ON film_actor.film_id = film.film_id " +
                             "WHERE actor.last_name LIKE ? " +
                             "ORDER BY actor.first_name");) {

            preparedStatement.setString(1, lastNameToSearch);

            try (ResultSet results = preparedStatement.executeQuery()) {
                while (results.next()) {
                    System.out.printf("first_name = %s, last_name = %s,  title = %s\n",
                            results.getString(1),
                            results.getString(2),
                            results.getString(3));
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
