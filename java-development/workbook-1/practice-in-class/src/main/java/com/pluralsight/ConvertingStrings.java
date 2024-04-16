package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertingStrings {
    public static void main(String[] args) {
       /* String productNumber = "111-Brya";

        int dashPosition = productNumber.indexOf('-');
        String numberPart = productNumber.substring(0, dashPosition);

        String namePart = productNumber.substring(dashPosition +1);

        int number = Integer.parseInt(numberPart); */

       /* String userInput = "2002-10-17";

        LocalDate birthday =LocalDate.parse(userInput); */

        String userInput;
        DateTimeFormatter formatter;

        userInput = "10/17/2022";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
        LocalDate birthDay = LocalDate.parse(userInput, formatter);



    }


}
