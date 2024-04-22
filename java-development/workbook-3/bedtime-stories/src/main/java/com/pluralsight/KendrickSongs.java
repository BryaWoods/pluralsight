package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KendrickSongs {
    public static void main(String[] args) {

        try {

        Scanner scanner = new Scanner(System.in);

        System.out.println("To Pimp A Butterfly Lyrics Assistant");
        System.out.println("Which song would you like the lyrics for?");
        System.out.println("Songs:");
        System.out.println("institutionalized.txt");
        System.out.println("theseWalls.txt");
        System.out.println("u.txt");
        System.out.print("Enter the song title: ");

        String songChoice = scanner.nextLine();



            FileInputStream fis = new FileInputStream(songChoice);
            Scanner fileScanner = new Scanner(fis);

            int lineNumber = 1;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber++ + ". " + line);

            }
            scanner.close();
            fileScanner.close();;

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }
}
