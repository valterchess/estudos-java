programa
{
	
	funcao inicio()
	{
		inteiro numero, somaPar =  0, somaImpar = 0

		escreva("\nEscreva entre com um número: ")
		leia(numero)

		enquanto( numero!=0 ){
			se(numero % 2 == 0){
				somaPar += numero
			}
			senao{
				somaImpar += numero
			}
			escreva("\nEscreva entre com um número: ")
			leia(numero)
			limpa()

		}
		escreva("\nSomatória dos números pares: ", somaPar)
		escreva("\nSomatória dos números impares: ", somaImpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */