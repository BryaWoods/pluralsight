package com.pluralsight;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        /*List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                matchingPeople.add(person);
            }
        }*/

       List<Person> matchingPeople  = people.stream()
                        .filter(match -> match.getFirstName().equalsIgnoreCase(searchName) || match.getLastName().equalsIgnoreCase(searchName))
                                .collect(Collectors.toList());

        System.out.println("🅁ⓔ🆂ⓤ🅛🅃🅢: ");
        matchingPeople.forEach(System.out::println);

        System.out.println("People with matching name:");
        for (Person person : matchingPeople) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        double averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);

        Optional<Integer> oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        Optional<Integer> youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    private static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        // Add at least 10 people to the list
        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Jane", "Smith", 30));
        people.add(new Person("Michael", "Johnson", 35));
        people.add(new Person("Emily", "Brown", 22));
        people.add(new Person("David", "Miller", 40));
        people.add(new Person("Sarah", "Davis", 28));
        people.add(new Person("Daniel", "Anderson", 33));
        people.add(new Person("Jessica", "Wilson", 27));
        people.add(new Person("Matthew", "Martinez", 31));
        people.add(new Person("Olivia", "Taylor", 29));

        return people;
    }

    private static double calculateAverageAge(List<Person> people) {
        double averageAge = people.stream()
                .collect(Collectors.averagingInt(Person::getAge));

        return (double) averageAge;
    }

    private static Optional<Integer> findOldestAge(List<Person> people) {

        /*for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();*/
        Optional<Integer> oldestAge = people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .map(Person::getAge);

        return oldestAge;
    }

    private static Optional<Integer> findYoungestAge(List<Person> people) {
        /*int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;*/

        Optional<Integer> youngestAge = people.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .map(Person::getAge);


        return youngestAge;

    }
}
