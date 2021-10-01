programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real nota1,nota2,nota3, media
		escreva("informe a primeira nota: ")
		leia(nota1)
		escreva("\ninforme a segunda nota: ")
		leia(nota2)
		escreva("\ninforme a terceira nota: ")
		leia(nota3)
		
		media = (nota1 + nota2 + nota3) / 3
		escreva("\nA media das notas é = ",  mat.arredondar(media,2))

		se (media >= 7.0 e media <= 10){
			escreva("\nParabéns você foi APROVADE")
		}
		senao se(media >= 5.0 e media < 7.0){
			escreva("\nAtenção, você ficou de EXAME")
		}
		senao {
			escreva("\nPutzzz, você REPROVADE")
		}
	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 594; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */