package com.pluralsight;

public class StringsPractice {
    public static void main(String[] args) {

        /*String welcome = "Big Tex says \"Howdy\"!";

        System.out.println(welcome);*/

        /*String message = "Hello \nWorld";

        System.out.println(message);*/

        /*String msg = "Hello \rworld";

        System.out.println(msg);*/

        /*String s1 = "ABC";

        String s2 = "ABC";

        String s3 = new String("ABC");

        if (s1 == s2) {
            System.out.println("s1 is equal to s2");
        }
        if (s1 == s3) {
            System.out.println("s1 is equal to s2");
            //NEVER USE == with strings always use .equals.//
        }*/
        /* CORRECT WAY
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 is equal to s2");
        }
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("s1 is equal to s2");
        }*/

        /*String fullName = "Brya Woods";
        int length = fullName.length();
        // length contains 10
        System.out.println(length);*/

        /*String username = " bryaw
        ";
        username = username.trim();
        // now it contains "bryaw"*/

        /*String username = "danaw";
        username = username.toUpperCase();
        // now it contains "DANAW"*/

       /* String username = " danaw
        ";
        username = username.trim().toUpperCase();
        // now it contains "DANAW"

        String username = " danaw
        ";
        username = username.trim().toUpperCase();
        // now it contains "DANAW"

        String state = "New Mexico";
        state = state.toLowerCase();
        // now it contains "new mexico"
        */

        String discountCode = "FAIR-15OFF";
        if (discountCode.startsWith("FAIR")) {
        // this is true
        }
        String discountCode = "SAVE-50";
        if (discountCode.endsWith("-50")) {
        // this is true
        }

        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
// hasShipped contains 'Y'

        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
// dashPosition contains 4

        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);
// vendor contains ACME and productNum contains 12213

        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
// cities is an array containing 3 strings
// [0] is Dallas, [1] is Ft. Worth, [2] is Austin







    }

}
