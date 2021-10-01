programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real n1,n2,n3,n4,p1,p2,p3,p4
		
		escreva("Insira o primeiro número: ")
		leia(n1)
		p1 = mat.potencia(n1,2.0)
		escreva("Insira o segundo número: ")
		leia(n2)
		p2 = mat.potencia(n2,2.0)
		escreva("Insira o terceiro número: ")
		leia(n3)
		p3 = mat.potencia(n3,2.0)
		escreva("Insira o quarto número: ")
		leia(n4)
		p4 = mat.potencia(n4,2.0)
		limpa()

		se (p3 >= 1000){
			escreva(n3, "ao quadrado é = ", p3)
		}
		senao {
			escreva(n1, " ao quadrado é = ", p1)
			escreva("\n",n2, " ao quadrado é = ", p2)
			escreva("\n",n3, " ao quadrado é = ", p3)
			escreva("\n",n4, " ao quadrado é = ", p4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 686; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */