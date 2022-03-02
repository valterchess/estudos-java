package com.princeton.firstpart.cap4.bookexr;

public class BirthDay {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]); //número de dias
        int people = 0; //total de pessoas

        //hasBirthDay[d] = true; se alguma data de nascimento for igual ao valor da posição d.
        //Senão será falso
        boolean[] hasBirthDay = new boolean[days];

        while (true){
            people++;
            int d = (int) (days * Math.random()); //inteiro entre 0 e days-1
            //ao encontrar duas pessoas com a mesma data de aniversário
            //o programa é parado
            if (hasBirthDay[d]) break;
            hasBirthDay[d] = true; //atualiza o array
        }
        System.out.println(people);
    }
}
