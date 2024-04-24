package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        String filename = "inventory.csv";
        ArrayList<Product> inventory = new ArrayList<>();
        getInventory(filename, inventory);
        Scanner scanner = new Scanner(System.in);



        Collections.sort(inventory, Comparator.comparing(Product::getName));

        boolean running = true;

        while (running) {
            System.out.println(" ");
            System.out.println("₊‧.°.⋆✮⋆.°.‧₊‧.°.⋆✮⋆.°.‧₊‧.°.⋆✮⋆.°.‧₊‧.°.⋆✮⋆.°.‧₊ ");
            System.out.println("What would you like me to help you with?");
            System.out.println("1- List all products");
            System.out.println("2- Lookup a product by its id");
            System.out.println("3- Find all products within a price range");
            System.out.println("4- Add a new product");
            System.out.println("5- Quit the application");
            System.out.print("Enter command: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    listAllProducts(inventory);
                    break;
                case 2:
                    lookupProductById(scanner, inventory);
                    break;
                case 3:
                    findProductsByPriceRange(scanner, inventory);
                    break;
                case 4:
                    addNewProduct(scanner, inventory);
                    saveInventoryToFile(filename,inventory);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
        }

        scanner.close();

        /*String filename = "inventory.csv";
        writeInventoryToFile(inventory, filename);*/

        /*System.out.println("We carry the following inventory: ");
        for (Product product : inventory) {
            System.out.printf("✰ id: %d %s - Price: $%.2f \n",
                    product.getId(), product.getName(), product.getPrice());
        }

        scanner.close();*/
    }

    public static ArrayList<Product> getInventory(String filename, ArrayList<Product> inventory) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);

                    inventory.add(new Product(id, name, price));
                } else {
                    System.out.println("Invalid data format in file: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }


    }

    private static void saveInventoryToFile(String filename, ArrayList<Product> inventory) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (Product product : inventory) {
                writer.write(product.getId() + "|" + product.getName() + "|" + product.getPrice() + "\n");
            }
            System.out.println("Inventory saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    private static void listAllProducts(ArrayList<Product> inventory) {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.printf("✰ id: %d %s - Price: $%.2f%n",
                    product.getId(), product.getName(), product.getPrice());
        }
    }

    private static void lookupProductById(Scanner scanner, ArrayList<Product> inventory) {
        System.out.print("Enter product id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Product foundProduct = null;
        for (Product product : inventory) {
            if (product.getId() == id) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct != null) {
            System.out.println("Product found:");
            System.out.printf("✰ id: %d %s - Price: $%.2f%n",
                    foundProduct.getId(), foundProduct.getName(), foundProduct.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void findProductsByPriceRange(Scanner scanner, ArrayList<Product> inventory) {
        System.out.print("Enter minimum price: ");
        double minPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Products within price range:");
        for (Product product : inventory) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                System.out.printf("✰ id: %d %s - Price: $%.2f%n",
                        product.getId(), product.getName(), product.getPrice());
            }
        }
    }

    private static void addNewProduct(Scanner scanner, ArrayList<Product> inventory) {
        System.out.print("Enter product id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        inventory.add(new Product(id, name, price));
        System.out.println("Product added successfully.");

    }
}
    /*public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(1, "Bratz Bluetooth Speaker", 16.99));
        inventory.add(new Product(2, "Juicy Couture Lip Gloss", 1.99));
        inventory.add(new Product(3, "Hello Kitty Poster", 6.99));
        inventory.add(new Product(4, "Pop Star Pink Rug", 166.99));
        inventory.add(new Product(5, "Funky Fashion Furniture", 1666.99));

        return inventory;
    }

    public static void writeInventoryToFile(ArrayList<Product> inventory, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (Product product : inventory) {
                writer.write(product.getId() + "|" + product.getName() + "|" + product.getPrice() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}*/


