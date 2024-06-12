package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1 name: ");
        String player1 = scanner.nextLine();

        System.out.println("Player 2 name: ");
        String player2 = scanner.nextLine();

        System.out.println(" Welcome " + player1 + " and " + player2 + " to Brya's Black Jack Bizarre ♠︎♣︎♥︎♦︎🂫 ");

        Deck deck = new Deck();

        System.out.println("Let's get started!");
        System.out.println("Shuffling deck ---");

        deck.shuffle();

        Hand player1Hand = new Hand();
        Hand player2Hand = new Hand();

        Card dealtCard = deck.deal();
        player1Hand.deal(dealtCard);







    }
}
