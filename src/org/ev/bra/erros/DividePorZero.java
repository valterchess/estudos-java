package org.ev.bra.erros;

import java.util.InputMismatchException;

import static org.ev.bra.erros.Imput.input;

public class DividePorZero {
    public static void main(String[] args) {
        boolean continuar = true;
        do {
            try{
                int a = Integer.parseInt(input("Numero: "));
                int b = Integer.parseInt(input("Divior: "));
                System.out.println(a / b);
                continuar = false;
            } catch (InputMismatchException e1){
                System.err.println("Erro de InputMismatchException capturado!");
            } catch (Throwable e2){
                System.err.println("Erro de ArithmaticException capturado!");
            } finally {
                System.out.println("Finally executado...");
            }
        } while (continuar);

    }
}
