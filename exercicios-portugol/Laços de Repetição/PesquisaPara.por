programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		cadeia nome
	
		real salario, somaSal = 0.0, mediaSalario,
			maiorSalario = 0.0, percentual
			inteiro mediaFilhos, 
			somaFilho = 0, filhos, perSalario = 0
		
		para(inteiro x = 0; x < 20; x++){
			escreva("\nInforme o nome do(a) habitante: ")
			leia(nome)
			escreva("\nInforme o salário do(a) ", nome,": ")
			leia(salario)
			escreva("informe o numero de filhos do(a) ", nome, ": ")
			leia(filhos)
			somaSal += salario
			somaFilho += filhos
			se (salario > maiorSalario){
				maiorSalario = salario
			}
			se (salario <= 100.0){
				perSalario++
			}	
			limpa()
		}
		mediaSalario = mat.arredondar(somaSal / 20,2)
		mediaFilhos = somaFilho / 20
		percentual = mat.arredondar((perSalario / 20) * 100.0,2)
		escreva("\nA média dos salário dos habitantes é de: R$", mediaSalario, ".")
		escreva("\nA média do número de filhos entre os habitates é de: ",mediaFilhos, " Filho(s).")
		escreva("\nO maior salário dentre os participantes é de: R$", maiorSalario,".")
		escreva("\nO percentual de pessoas com salário de até R$100,00. É de: ", percentual,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */