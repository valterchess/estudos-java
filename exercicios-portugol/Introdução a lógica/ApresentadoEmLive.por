programa
{		
	/*funcao println(cadeia string){
		escreva(string,"\n")
		}
	funcao printl(real valor){
		escreva(valor,"\n")
		}

	funcao real power(real base, real expoente){
			real apoio = 0.0
			para(inteiro i = 0; i < (expoente - 1); i++){
				apoio += base * base 
				}
			retorne apoio
		}*/

		inclua biblioteca Matematica --> mat
		
	funcao inicio()
	{
		inteiro idade = 26, a, b
		cadeia nome
		real altura, nota1, nota2, nota3, media
		
		//real valor = power(2.0,3.0)
		
		//printl(valor)
		
		escreva("\ninforme seu nome para começar. ")
		leia(nome)
		escreva("seja bem vindo " + nome + "!")
		
		escreva("\nAgora, informe sua ltura: ")
		leia(altura)
		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)
		escreva("\nEntre com A: ")
		leia(a)
		escreva("\nEntre com B: ")
		leia(b)

		media = (nota1 + nota2 + nota3) / 3
		escreva("\nNome : ", nome,"\nIdade: ", idade, "\nAltura: ", altura)
		escreva("\nMédia: ",mat.arredondar(media,2))
		nota1 = mat.raiz(nota2, 2.0)
		nota2 = mat.potencia(nota2, 3.0)
		nota3 = a % b
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */