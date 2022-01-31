package org.ev.bra.modelos;

public class Conta {
    private String cliente;
    private double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean saca(double valor){
        if (this.saldo > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
            System.err.println("saldo insuficiente!");
            return false;
    }
    public boolean deposita(double valor){
        if (valor > 5) {
            this.saldo += valor;
            System.out.println("valor depositado com sucesso!");
            return true;
        }
        System.out.println("valor mínimo para depósito é de R$5,00.");
        return false;
    }
    public void transfere(Conta conta, double valor){
        if (saca(valor)){
            conta.deposita(valor);
        }
    }
}
