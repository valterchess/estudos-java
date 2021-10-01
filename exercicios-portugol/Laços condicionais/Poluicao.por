programa
{
	
	funcao inicio()
	{
		real indice
		escreva("Informe o indice de poluição: ")
		leia(indice)
		limpa()
		se (indice >= 0.05 e indice <= 0.25){
			escreva("Os indices de poluição permanessem aceitáveis")
		}
		senao se (indice > 0.25 e indice < 0.4) {
			se(indice < 0.3){	
				escreva("Indice próximo do limite, notificar as empresas de 1º sobre uma possível suspensão.")
			} 
			senao{
				escreva("Indice atingiu o primeiro limite, acionar a suspensão das atividades das empresas de 1º.")
				escreva("\nE Notificar as empresas de 2º sobre uma pssível suspensão das atividades.")
			}	
		} senao se (indice >= 0.4 e indice < 0.5){
			escreva("Indice atingiu o segundo limite, acionar a suspensão das atividades das empresas de 2º.")
			escreva("\nE notificar as empresas de 3º sobre uma possível suspensão.")
		}
		senao {
			escreva("O nível de poluição está muito além do limite,\n acionar todos os grupos para a suspensão imediata das atividades.")
			}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */