package com.java;

public class OperadorLogico {
    public static void main(String[] args) {
        int x = 9, y = 11;

        // O operador ^ (xor)(ou exclusivo) verifica se um ou outro valor é true
        // se os dois valores forem 'true' ou se os dois valores forem 'false'
        // o valor retornado é false.
        //Retorna 'true' se apenas um dos valores forem 'true'
        boolean teste = x > 10 ^ y > 10;
        System.out.println(teste);
    }
}
