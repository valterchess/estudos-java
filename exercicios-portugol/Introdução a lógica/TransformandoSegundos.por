programa
{
	inclua biblioteca Matematica
 --> mat
	
	funcao inicio()
	{
		inteiro totalSegundos, minutos, horas,segundos
		escreva("Informe o periodo de durção do evento em segundos: ")
		leia(totalSegundos)
		minutos = (totalSegundos % 3600) / 60
		horas = totalSegundos / 3600
		segundos = (totalSegundos % 3600) % 60

		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */