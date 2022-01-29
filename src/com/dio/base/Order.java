package com.dio.base;

import java.math.BigDecimal;

/**
 * @author Valter Silva
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */
public class Order {
    private final String code;
    private final BigDecimal totalValor;
//private String[] itens;

    /**
     * Construtor da Classe
      * @param code Código do pedido
     * @param totalValor Valor total do pedido
     */
    public Order(String code, BigDecimal totalValor) {
        this.code = code;
        this.totalValor = totalValor;
    }

    /**
     * Calcula as taxas de acordo com o valor total do pedido.
     * Se o valor for maior que R$100,00 uma taxa será cobrada.
     * @return Valor total do pedido com taxas
     * @throws RuntimeException se o valor do pedido for negativo
     */
    public BigDecimal calculaFee() throws RuntimeException {
        if (this.totalValor.signum() < 0){
            throw new RuntimeException("O pedido nao pode ter valor negativo.");
        }
    return (this.totalValor.compareTo(new BigDecimal("100.0")) > 100)
            ? this.totalValor.multiply(new BigDecimal("0.99"))
            : this.totalValor;
}

//    public void imprimirItens() {
//        int i = 0;
//        while (i < itens.length){
//            System.out.println(itens[i]);
//        }
//    }

}
