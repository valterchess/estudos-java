programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, total = 0, soma = 0, media
		
		enquanto(numero >=0){
			escreva("\ninforme um numero: ")
			leia(numero)
			escreva("\nSe deseja parar o programa informe um numero negativo: ")
			total++
			soma += numero 
		}
		limpa()
		media = soma / total
		escreva("\nA soma dos valores apresentados é: ", soma)
		escreva("\nA media dos valores apresentados é: ", media)
		escreva("\nVocê informou um total de ", total, " números.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */