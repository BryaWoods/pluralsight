package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        actionLog("launch");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a search term (X to exit): ");
            String inputSearch = scanner.nextLine();

            if ("X".equalsIgnoreCase(inputSearch)) {
                actionLog("Exit");
                break;
            } else {
                actionLog("search : " + inputSearch);
            }
        }

        scanner.close();


    }

    public static void actionLog(String action) {

        try {
            LocalDateTime today = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = today.format(formatter);

            FileWriter avocadoWriter = new FileWriter("logs.txt", true);
            BufferedWriter buffWriter = new BufferedWriter(avocadoWriter);


            buffWriter.write(formattedDateTime + " " + action +"\n");

            buffWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
