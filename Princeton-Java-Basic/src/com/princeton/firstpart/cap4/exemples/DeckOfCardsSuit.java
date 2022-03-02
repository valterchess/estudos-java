package com.princeton.firstpart.cap4.exemples;

public class DeckOfCardsSuit {
    public static void main(String[] args) {

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suit = {"♠", "♦", "♥", "♠"};
        String[] deck = new String[52];
        for (int j = 0; j < 4; j++){
            for(int i = 0; i < 13; i++){
                deck[i + 13 * j] = rank[i] + suit[j];

                for (int k = 0; k < deck.length; k++){
                    System.out.print(deck[k] + ", ");
                    System.out.println();
                }
            }
        }
    }
}
