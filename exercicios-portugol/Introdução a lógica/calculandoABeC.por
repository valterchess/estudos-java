programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,R,S,D
		escreva("informe o valor de a: ")
		leia(a)
		escreva("informe o valor de b: ")
		leia(b)
		escreva("informe o valor de c: ")
		leia(c)
		R = mat.potencia((a + b),2.0)
		S = mat.potencia((b + c), 2.0)
		D = (R + S) / 2
		escreva("\nO resultado do calcúlo é: ", D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */