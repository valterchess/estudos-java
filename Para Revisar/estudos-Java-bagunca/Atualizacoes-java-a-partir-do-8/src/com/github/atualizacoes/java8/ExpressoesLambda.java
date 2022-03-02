/**
 * 
 */
package com.github.atualizacoes.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author valter
 * A introduçao das expressões lambda no java 8,
 * permitem que parâmetros de métodos recebam funcionalidades como um argumento
 * ou código como dados. 
 *As expressões lambda podem expressar instâncias de interfaces
 * em um único método de forma mais compacta.
 * Esta é uma evolução da linguagem Java
 *  que a torna mais flexível e deixa a sua implementação de código menos verbosa.
 *  Usarei uma List para exmplificar.
 */
public class ExpressoesLambda {
	public static void main(String[] args) {
		
		List<String> novidades8 = Arrays
				.asList("Lambdas", "Default Method", 
						"Stream API", "Date and Time API");
			
		//antes do java 8
		for (String novidade : novidades8) {
			System.out.println(novidade);
		}
		// Usando o lambda no java 8*:
		novidades8.forEach(n -> System.out.println(n));
	}
}
