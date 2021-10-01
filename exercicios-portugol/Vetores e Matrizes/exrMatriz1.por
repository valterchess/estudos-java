programa{
	
	funcao inicio(){

		inteiro m1[4][6],m2[4][6],m3[4][6]
		
		para(inteiro l = 0;l < 4;l++){
			
			para(inteiro c = 0; c < 6;c++){
				
				escreva("\nInforme um valor para m1: ")
				leia(m1[l][c])
				escreva("\nInforme um valor para m2: ")
				leia(m2[l][c])
				
			}
		}
		
		para(inteiro l = 0;l < 4;l++){
			
			para(inteiro c = 0; c < 6;c++){
			
				m3[l][c] = m1[l][c] + m2[l][c]
			}
		}

		para(inteiro l = 0;l < 4;l++){
			
			para(inteiro c = 0; c < 6;c++){
			
				m3[l][c] = m1[l][c] - m2[l][c]
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */