package com.notes.java.exceptions.main;

import com.notes.java.shalow.Conta;

public class testaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Valter", "9153");
        Conta conta2 = new Conta("Blibx", "531617");

        conta1.deposita(1000);
        System.out.println("---------");
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo() + "\n");
        conta1.transferePara(conta2, "9153", 1000.0);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo() + "\n");
    }
}
