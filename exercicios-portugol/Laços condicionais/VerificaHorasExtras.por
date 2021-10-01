programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia c
		inteiro n
		real salario,salarioTotal, salarioExtra, horasExtras
		const real salarioHora = 10.0
		const real precoHoraExtra = 20.0
		const real limite = 50.0
		escreva("Informe o Código do Funcionário: ")
		leia(c)
		escreva("Informe o número de horas trabalhadas: ")
		leia(n)
		limpa()
		se (n > limite){
			horasExtras = n - limite
			salario = mat.arredondar(limite * salarioHora, 2)
			salarioExtra = mat.arredondar(horasExtras * precoHoraExtra, 2)
			salarioTotal = mat.arredondar(salario + salarioExtra, 2)
			
			escreva("O funcionário de Código: ", c,". Deverá receber: ")
			escreva("\nSalario Base: R$ ", salario, ".")
			escreva("\nE como o funcionário cumpriu o total de ", horasExtras, " horas Extras.")
			escreva("\nO valor de R$", salarioExtra ,". será agregado ao salário.")
			escreva("\nSendo assim, o valor total a ser pago é de: R$ ",salarioTotal,".")
			escreva("\n________________________________________________________________________")
			escreva("\n                                                               IMPRIMIR.")
		}
		senao {
			horasExtras = 0.0
			salario = mat.arredondar(n * salarioHora, 2)
			salarioExtra = 0.0
			salarioTotal = salario
		
			escreva("O funcionário de Código: ", c,". Deverá receber: ")
			escreva("\nSalario Base: R$ ", salarioTotal, ".")
			escreva("\nComo o funcionário não cumpriu horas Extras.")
			escreva("\nO valor total a ser pago é de: R$ ",salario,".")
			escreva("\n________________________________________________________________________")
			escreva("\n                                                               IMPRIMIR.")
		}	
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */