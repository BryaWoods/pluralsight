package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {

    }

    public static String format(String firstName,
                                String lastName){

        return lastName + ", " + firstName;

    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {

        StringBuilder formattedName = new StringBuilder();

        formattedName.append(lastName).append(", ");

        if (prefix != null && !prefix.isEmpty()) {
            formattedName.append(prefix).append(" ");
        }
        formattedName.append(firstName);
        if (middleName != null && !middleName.isEmpty()) {
            formattedName.append(" ").append(middleName);
        }
        if (suffix != null && !suffix.isEmpty()) {
            formattedName.append(", ").append(suffix);
        }
        return formattedName.toString();
    }

    public static String format(String fullName){

        String[] nameParts = fullName.split(" ");
        if (nameParts.length >= 2) {
            String lastName = nameParts[nameParts.length - 1];
            String firstName = nameParts[nameParts.length - 2];
            String prefix = "";
            String middleName = "";
            String suffix = "";

            if (nameParts.length >= 3) {
                prefix = nameParts[0];
                middleName = nameParts[nameParts.length - 3];
            }
            if (nameParts.length >= 5) {
                suffix = nameParts[nameParts.length - 4] + " " + nameParts[nameParts.length - 3];
            } else if (nameParts.length == 4) {
                suffix = nameParts[nameParts.length - 3];
            }

            return format(prefix, firstName, middleName, lastName, suffix);
        }
        return fullName;

    }




}
