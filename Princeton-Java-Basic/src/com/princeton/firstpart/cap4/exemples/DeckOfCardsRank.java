package com.princeton.firstpart.cap4.exemples;

public class DeckOfCardsRank {
    public static void main(String[] args) {
        int N = 10;
        String[] rank = {" 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 "
                , " 8 ", " 9 ", " 10 ", " J ", " Q ", " K ", " A "};

        String[] suit = {"♠", "♦", "♥", "♠"};
        String[] deck = new String[52];

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                /*
                    adiciona os valores no deck, tendo como prioridade o rank
                    começando pelo valor dois seguindo os nipes na ordem: 2♠, 2♦, 2♥, 2♠
                    adicionando os valores na ordem do deck
                */
                deck[(4 * i) + j] = rank[i] + suit[j];
                System.out.print("posição : " + ((4 * i) + j) + " = ");
                System.out.print(deck[(4 * i) + j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < rank.length; i++){
            for (int j = 0; j < suit.length; j ++){
                /*
                    adiciona os valores no deck, tendo como prioridade o suit
                    começando pelo suit ♠ seguindo os valores na ordem: 2♠,3♠,4♠,5♠...
                    adicionando os valores na ordem do deck
                */
                deck[(13 * j) + i] = rank[i] + suit[j];
                System.out.print("posição : " + ((13 * j) + i) + " = ");
                System.out.print(deck[i + 13 * j] + " ");
            }
            System.out.println();
        }
        //retorna uma sequencia aleatoria com os valores do deck
        // utilizando essa estrutura e possivel que algum valor possa se repetir
        for (int i = 0; i < N; i++) {
            int r = (int) (Math.random() * (deck.length));
            System.out.print(deck[r]);
        }

        //embaralha o deck
        //diferente da estrutura anterior, essa literalmente embaralha os valores no array
        for (int i = 0; i < N; i++) {
            int r = i + (int) (Math.random() * (deck.length-i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }
        System.out.println();
        for (int i = 0; i < N; i++){
            System.out.print(deck[i]);
        }
    }
}
