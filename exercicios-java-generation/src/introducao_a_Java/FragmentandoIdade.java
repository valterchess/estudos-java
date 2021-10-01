package introducao_a_Java;
import java.util.Scanner;

public class FragmentandoIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano de nascimento: ");
		int nasc,idade, hoje = 2021,ano = 365;
				
		System.out.println("Informe a sua data de nascimento: ");
		System.out.print("Insira o ano que você nasceu: ");
		nasc = entrada.nextInt();
		idade = (hoje-nasc) * ano;
		System.out.printf("Você tem %d dias de vida: ",idade);
		entrada.close();
	}

}
