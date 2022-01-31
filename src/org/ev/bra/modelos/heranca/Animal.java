package org.ev.bra.modelos.heranca;

public class Animal {
    private String peso;
    private String comida;
    private String cor;
    private boolean estado;
    public void comer(){System.out.println("Comendo...");}
    public void dormir(){System.out.println("dormindo...");}
    public void movimentar(){}
    public void fazerBarulho(){}

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
