package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String formattedName1 = NameFormatter.format("Brya","Woods");
        System.out.println(formattedName1);

        String formattedName2 = NameFormatter.format("Evil","Brya"
                ,"Marie","Woods","PhD");
        System.out.println(formattedName2);

        String formattedName3 = NameFormatter.format("Brya Marie Woods");
        System.out.println(formattedName3);



    }
}
