package org.ev.bra.teste;

import org.ev.bra.modelos.Conta;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setCliente("Daniel");
        conta.setSaldo(4_000.00);
        System.out.println(conta.getSaldo());
    }
}
