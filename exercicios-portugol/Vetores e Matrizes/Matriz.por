programa
{
	
	funcao inicio()
	{
		inteiro numeros[2][3], somaNumero = 0, linha, coluna
		real mediaNumero

		para(linha = 0; linha < 2; linha++){
			para (coluna = 0; coluna < 3;coluna++){
				
				escreva("\nEntre com um número: ")
				leia(numeros[linha][coluna])
				somaNumero += numeros[linha][coluna]
			}
		}
		mediaNumero = somaNumero / 6
		escreva("\nMédia dos números: ", mediaNumero)
		
		/*
		 para (linha = 0; linha< 2;linha++){
		 	para(coluna = 0; coluna < 3; coluna++){
		 		escreva("\n",numeros[linha][coluna])
	 		}
	 	 }
		 */
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */