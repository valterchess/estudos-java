programa
{
	
	funcao inicio()
	{
		real media[4],n1,n2,n3,mediageral, somaMedia = 0.0

		para(inteiro i = 0; i < 4;i++){
			escreva("\nInforme a primeira nota: ")
			leia(n1)
			escreva("\nInforme a segunda nota: ")
			leia(n2)
			escreva("\nInforme a terceira nota: ")
			leia(n3)

			media[i] = (n1 + n2 + n3) / 3
			escreva("\nMédia aluno(a): ",media[i])
			somaMedia += media[i]
		}
		mediageral = somaMedia / 4
		escreva("\nMédia geral alune: ", mediageral)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */