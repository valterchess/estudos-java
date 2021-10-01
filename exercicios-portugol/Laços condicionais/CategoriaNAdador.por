programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia nome
		escreva("Informe o nome do nadador: ")
		leia(nome)
		limpa()
		escreva("Informe a idade do nadador")
		leia(idade)
		limpa()
		escreva("nadador: ", nome)
		escreva("\nidade: ", idade)

		se(idade < 5){
			escreva("\ncaegoria Baby.")
		}
		se(idade >= 5 e idade <=7){
			escreva("\nCategoria: infantil A.")
		}
		senao se(idade > 7 e idade <= 11){
			escreva("\nCategoria: infantil B.")
		}
		senao se(idade > 11 e idade <= 13){
			escreva("\nCategoria: Juvenil A.")
		}
		senao se(idade > 13 e idade <= 17){
			escreva("\nCategoria: Juvenil B.")
		}
		senao{
			escreva("\nCategoria:Adulto.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */