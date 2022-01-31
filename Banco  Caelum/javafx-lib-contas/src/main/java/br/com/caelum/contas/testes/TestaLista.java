package br.com.caelum.contas.testes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Conta;

public class TestaLista {
	public static void main(String[] args) {
		List<Conta> contas = new LinkedList<>();
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		ContaCorrente c3 = new ContaCorrente();
		ContaCorrente c4 = new ContaCorrente();
		
		c1.setTitular("Pedro");
		c2.setTitular("Bila");
		c3.setTitular("Fimblo");
		c4.setTitular("Jhunfs");
		
		contas.add(c1);
		contas.add(c2);	
		contas.add(c3);
		contas.add(c4);
		
		Random gerador = new Random();
		for (int i = 0; i < contas.size(); i++) {
		contas.get(i).deposita(gerador.nextInt(1000));
		System.out.println(contas.get(i).getSaldo());
		}
		
		
		Collections.sort(contas);
		
		System.out.println(contas);
	}	 
}


