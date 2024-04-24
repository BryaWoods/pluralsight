package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    public static HashMap<Integer, Product> inventory =
            new HashMap<>();
    // the key is the product id, the value is a product object
    public static void main(String[] args) {


            String filename = "inventory copy.csv";
            loadInventory(filename);
            Scanner scanner = new Scanner(System.in);

            boolean running = true;

            while (running) {
                System.out.print("What item # are you interested in? ");
                int id = scanner.nextInt();
                scanner.nextLine();

                Product matchedProduct = inventory.get(id);
                if (matchedProduct == null) {
                    System.out.println("We don't carry that product");
                } else {
                System.out.printf("We carry %s and the price is $%.2f\n",
                        matchedProduct.getName(), matchedProduct.getPrice());
                }

                  System.out.println("Do you want to search again? (yes/no): ");
                    String response = scanner.nextLine().trim().toLowerCase();

                    if (!response.equals("yes") && !response.equals("y")) {
                    running = false;
        }
    }
            scanner.close();
        System.out.println("Exiting the application");

        }

        public static void loadInventory(String filename){

            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    if (parts.length == 3) {
                        int id = Integer.parseInt(parts[0]);
                        String name = parts[1];
                        double price = Double.parseDouble(parts[2]);

                        Product product = new Product(id, name, price);
                        inventory.put(id,product);

                    } else {
                        System.out.println("Invalid data format in file: " + line);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());

        }

    }
}


