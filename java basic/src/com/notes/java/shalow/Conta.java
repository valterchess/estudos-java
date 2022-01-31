package com.notes.java.shalow;

public class Conta {
    private static final String AGENCY = "0001";
    private static int userId;
    private final String acount = String.format("%d - %d",(int)(Math.random() * 100000), 0);
    private final String userName;
    private double saldo;
    private final String password;

    public Conta(String userName, String password) {
        this.userName = userName;
        this.password = password;
        ++userId;
    }

    public static String getAGENCY() {
        return AGENCY;
    }

    public static int getUserId() {
        return userId;
    }

    public String getAcount() {
        return acount;
    }

    public String getUserName() {
        return userName;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposita(double valor){
        if(valor >= 10){
            saldo += valor;
            System.out.println("Operação efetuada com sucesso!");
            return true;
        }
        System.out.println("O valor minimo para deposito é de 10D$");
        return false;
    }
    public boolean saca(double valor, String senha){
        if (saldo > 0 && saldo >= valor && senha.equals(this.password)){
            saldo -= valor;
            return true;
        } else if(saldo < valor && senha.equals(this.password)){
        System.out.println("Saldo insuficiente.");
        return false;
        }
        System.out.println("senha incorreta.");
        return false;
    }
    public void transferePara(Conta toAcount, String senha, double valor){
            if (saca(valor,senha)) toAcount.deposita(valor);
    }
}
