programa
{
	
	funcao inicio()
	{	
		//variável que recebe o valor total
		inteiro soma = 0
		
		para(inteiro i = 0; i < 500; i++){
			
			/*
			Se o resto da divisão de i por 2 for igual a zero
			e */
			se(i % 2 != 0 e i % 3 == 0){
				soma += i
			}
		}
		escreva("A soma dos impares multiplos de 3 de 0 à 500 é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */