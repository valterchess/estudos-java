programa
{
	inclua biblioteca Matematica
 --> mat
	
	funcao inicio()
	{
		real nota1,nota2,nota3
		escreva("informe a primeira nota: ")
		leia(nota1)
		escreva("\ninforme a segunda nota: ")
		leia(nota2)
		escreva("\ninforme a terceira nota: ")
		leia(nota3)

		real media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5)

		escreva("\nA media ponderada das notas é = ",  mat.arredondar(media,2))
	}
}

