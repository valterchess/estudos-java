programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vetor[10],soma = 0, maiorNumero=0, media, totalDeMn = 0

		para(inteiro i = 0; i < 10;i++){
			vetor[i] = Util.sorteia(1,6)
			soma += vetor[i]
			escreva("\n",vetor[i])
			se(vetor[i] > maiorNumero){
				maiorNumero = vetor[i]
			}
		}
		media = soma / 10
		escreva("\nA Média dos valores obtidos é: ", media)
		para(inteiro i = 0; i < 10;i++){
			se(vetor[i] == maiorNumero){
				totalDeMn++
			}
		}
		escreva("\nO maior número apareceu ", totalDeMn, " vez(es).")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */