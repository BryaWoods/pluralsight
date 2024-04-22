package com.pluralsight;

import java.util.Scanner;

public class FamousQuotesApp {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            String[] quotes = new String[10];

            quotes[0] = new String("Sucks you can’t gas me up, shout out to Elon");
            quotes[1] = new String("hi, my name is tyler the creator. i execute ideas for a living");
            quotes[2] = new String("Sometimes you gotta close a door to open a window");
            quotes[3] = new String("See, for y'all, the sky is the limit. For us, the sky is just what we stand on ");
            quotes[4] = new String("If I was the monster under your bed, you'd be the kids I ate");
            quotes[5] = new String("I like some of the Gaga songs, but what does she know about cameras");
            quotes[6] = new String("I am God’s vessel. But my greatest pain in life is that I will never be able to see myself perform live.");
            quotes[7] = new String("Similar to Tesla, I'm about lighting the world up.");
            quotes[8] = new String("Prince outlived Mike Jack");
            quotes[9] = new String("KICK ME OUT THE MET BUT I REALLY RUN FASHION.");


            System.out.println("Please select a number 1-10 to generate a quote: ");
            int userNum = scanner.nextInt();

            System.out.println(quotes[userNum - 1]);


        } catch (Exception ex) {
            System.out.println("Invalid number. Follow the instructions!");
        }
    }
}

