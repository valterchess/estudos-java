programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real p,m,E
		const real limite = 50.0
		const real multa = 4.0
		escreva("Informe o peso dos tomates: ")
		leia(p)
		se(p > limite){
		E = mat.arredondar(p - limite, 2)
		m = mat.arredondar(multa * E, 2)
		
		escreva("O peso excedeu: ", E," quilos.")
		escreva("\nO valor da multa é de R$ ",m)
		}
		senao {
			E = 0.0
			m = 0.0
			escreva("Não houve excesso de peso.")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */