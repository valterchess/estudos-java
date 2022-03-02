package com.princeton.firstpart.cap4.bookexr;

import java.util.Scanner;

public class BirthDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número de dias a serem testados:");
        int days = scan.nextInt(); //número de dias
        System.out.println("Informe quantas vezes deseja simular:");
        int quantidade = scan.nextInt(); //quantidade de simulações
        int people = 0; //total de pessoas

        //hasBirthDay[d] = true; se alguma data de nascimento for igual ao valor da posição d.
        //Senão será falso
        boolean[] hasBirthDay = new boolean[days];

        for (int i = 0; i < quantidade; i++) {
            while (true){
                people++;
                int d = (int) (days * Math.random()); //inteiro entre 0 e days-1
                //ao encontrar duas pessoas com a mesma data de aniversário
                //o programa é parado
                if (hasBirthDay[d]) break;
                hasBirthDay[d] = true; //atualiza o array
            }
        }
        double media = (double) people / quantidade;

        System.out.println(media);
    }
}
