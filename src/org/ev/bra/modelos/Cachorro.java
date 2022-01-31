package org.ev.bra.modelos;

public class Cachorro {
   private int tamanho;
    private String raca;

    public void latir() {
        System.out.println("waw, waw, waw...!!!");
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
