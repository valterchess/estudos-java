package com.princeton.firstpart.cap4.bookexr;

public class Deal {
    public static void main(String[] args) {
        // O número de cartas para cada jogador é limitado a 5
        int CARDS_PER_PLAYER = 5;
        // O usuário deve selecionar o número de players antes da execução
        int players = Integer.parseInt(args[0]);

        // São definidos os valores para o deck
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"♠", "♦", "♥", "♠"};
        // n recebe o valor do deck
        int n = rank.length * suit.length;

        // É verificado o número de players de acordo com o número de cartas
        if (CARDS_PER_PLAYER * players > n){
            throw new RuntimeException("Muitos jogadores");
        }

        //O deck (baralho) é definido de forma organizada.
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++){
            for (int j = 0; j < suit.length; j++){
                deck[suit.length * i + j] = rank[i] + " " + suit[j];
            }
        }
        // O deck é embaralhado
        for(int i = 0; i < deck.length; i++){
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        //As cartas são distribuidas aos 'jogadores'
        for(int i = 0; i < players * CARDS_PER_PLAYER; i++){
            System.out.println(deck[i]);
            /***
             * se o número da posição (i) for igual a um número que,
             * dividido pelo número de cartas por jogador (5) tenha como resto
             * o número de cartas (5) menos 1. O próximo jogador recebe as cartas.
              */
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1){
                System.out.println();
            }
        }
    }
}