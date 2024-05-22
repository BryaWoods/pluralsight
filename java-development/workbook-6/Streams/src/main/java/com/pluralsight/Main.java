package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Brya","Woods",26));
        personList.add(new Person("Billie","Eilish",21));
        personList.add(new Person("Kendrick","Lamar",36));
        personList.add(new Person("Kanye","West",46));
        personList.add(new Person("Donald","Glover",32));
        personList.add(new Person("Bad","Bunny",30));
        personList.add(new Person("Mac","Miller",21));
        personList.add(new Person("Tyler","TheCreator",30));
        personList.add(new Person("Tim","Robinson",42));
        personList.add(new Person("Monica","Dunlap",35));


        System.out.println("Name Search ⭐︎");
        System.out.println("Enter name (First or Last): ");
        String searchName = scanner.nextLine();

        List<Person> nameSearchMatch = new ArrayList<>();
        for (Person person : personList) {
            if (person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName)) {
                nameSearchMatch.add(person);
            }
        }

            if (nameSearchMatch.isEmpty()) {
                System.out.println("No matches found.");
            } else {
                System.out.println("🅁ⓔ🆂ⓤ🅛🅃🅢: ");
                for (Person searchMatch : nameSearchMatch) {
                    System.out.println(searchMatch);

                }
            }

            int totalAge = 0;
            int oldestAge = Integer.MIN_VALUE;
            int youngestAge = Integer.MAX_VALUE;
            Person oldestPerson = null;
            Person youngestPerson = null;


        for (Person person : personList) {
            int age = person.getAge();
            totalAge += age;

            if (age > oldestAge) {
                oldestAge = age;
                oldestPerson = person;

            }

            if (age < youngestAge){
                youngestAge = age;
                youngestPerson = person;
            }

        }

        double averageAge = totalAge / (double) personList.size();
        System.out.println(" ");
        System.out.println("⭐︎ Average Age: " + averageAge);
        System.out.println("⭐︎ Closest to death: " + oldestPerson.getFirstName() + " " +  oldestPerson.getLastName() + ": " + oldestAge);
        System.out.println("⭐︎ The baby: " + youngestPerson.getFirstName() + " " + youngestPerson.getLastName() + ": " +  youngestAge);





    }
}
