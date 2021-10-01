programa
{
	
	funcao inicio()
	{
		inteiro n
		escreva("informe um número para verificação: ")
		leia(n)
		limpa()
		
		
			se (n == 0){escreva(n, " É um número neutro.")}
			
			se(n % 2 != 0 e n < 0){
				escreva(n," É impar e é um número negativo.")
			}
			senao se (n % 2 == 0 e n < 0){
				escreva(n," É par e é um número negativo.")
			}
			senao se(n % 2 != 0 e n > 0){
				escreva(n," É impar e é um número positivo.")
			}
			senao se (n != 0 e n % 2 == 0 e n > 0){
				escreva (n," É par e é um número positivo.")
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */