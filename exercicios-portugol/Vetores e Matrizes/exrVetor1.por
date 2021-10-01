programa
{
	
	funcao inicio()
	{
		real vetor[5], maiorPontuacao = 0, pontuacao

		para (inteiro i = 0; i < 5;i++){
			escreva("\nInforme a pontuação",i,": ")
			leia(pontuacao)
			vetor[i] = pontuacao
			escreva("\n",i, ": ", pontuacao)
			se (pontuacao > maiorPontuacao){
				maiorPontuacao = pontuacao
			}
			escreva("\nA maior pontuacao obitida é de ", maiorPontuacao)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */