package br.com.caelum.contas.testes;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
	List<Integer> teste = new LinkedList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0; 
		
		System.out.println("tempo gasto na incerção: " + tempo);
		
		for (int valor : teste) {teste.get(valor);}
		long outroFim = System.currentTimeMillis();
		double tempoPercorrndo = (outroFim - inicio - tempo) / 1000;
		System.out.println("Levou: (" + tempoPercorrndo + ") minutos para percorrer a lista" );
		
		
		/*for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio - meio;
		
		System.out.println("tempo gasto na busca: " + tempo);
		
	*/}

}
