package com.notes.java.exceptions.main;

import java.io.FileNotFoundException;

public class Teste {
    public static void main(String[] args) throws FileNotFoundException {

        //try {
            new java.io.FileInputStream("arquivo.txt");
        //} catch (FileNotFoundException e){
          //  System.out.println("Arquivo não encontrado ou inexistente");
        //}
    }
}
