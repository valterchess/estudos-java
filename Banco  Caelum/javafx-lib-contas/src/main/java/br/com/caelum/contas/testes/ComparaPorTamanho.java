package br.com.caelum.contas.testes;

import java.util.Comparator;

public class ComparaPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
}


