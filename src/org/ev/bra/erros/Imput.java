package org.ev.bra.erros;

import java.util.Scanner;

public class Imput {
    public static String input(String mensagem){
        System.out.print(mensagem);
        Scanner scan = new Scanner(System.in);
        String valor = scan.nextLine();
        return valor;
    }
}
