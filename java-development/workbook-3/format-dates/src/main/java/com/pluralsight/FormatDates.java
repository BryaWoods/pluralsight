package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = today.format(fmt);
        System.out.println(formattedDate1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = today.format(fmt2);
        System.out.println(formattedDate2);

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = today.format(fmt3);
        System.out.println(formattedDate3);

        ZonedDateTime gmtDateTime = today.atZone(ZoneId.of("GMT"));
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        String formattedDate4 = gmtDateTime.format(fmt4);
        System.out.println(formattedDate4);

        ZonedDateTime estDateTime = today.atZone(ZoneId.of("US/Eastern"));
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("h:mm a 'on' dd-MMM-yyyy ");
        String formattedDate5 = estDateTime.format(fmt5);
        System.out.println(formattedDate5);
    }
}
