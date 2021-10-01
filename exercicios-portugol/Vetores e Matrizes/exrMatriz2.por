programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], soma = 0, somaL = 0, somaC = 0

		para(inteiro l = 0; l < 3; l++){
			para(inteiro c = 0; c < 3; c++){
				escreva("\nInforme um valor: ")
				leia(matriz[l][c])
				soma+= matriz[l][c]
				
				se(l == 0) {
					somaL += matriz[l][c]
				}
				senao se (c == 0){
					somaC += matriz[l][c]
				}
			}
		}
		escreva("\nA soma dos valores da matriz é ", soma)
		escreva("\nA soma dos valores da primeira linha da matriz é: ", somaL)
		escreva("\nA soma dos valores da primeira coluna da matriz é: ", somaC)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */