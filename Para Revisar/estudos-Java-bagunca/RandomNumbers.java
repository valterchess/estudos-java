 
public class RandomNumbers {
	public static void main(String []args) {
		double num1 = Math.random();
		double num2 = Math.random();
		double num3 = Math.random();
		double num4 = Math.random();
		double num5 = Math.random();

		double med = (num1 + num2 + num3 + num4 + num5) / 5;

		double minimo = Math.min(num1,Math.min(Math.min(num2,num3)
					,Math.min(num4,num5)));
		
		double maximo = Math.max(num1,Math.max(Math.max(num2,num3)
					,Math.max(num4,num5)));
		double mediaInMaxEMin = (maximo + minimo) / 2; 
		
		System.out.println("A média dos valores aleatórios é: " + med);
		
		System.out.println("Dentre os valores gerados o valor minimo é de: " + minimo
			+ "\nE o valor máximo é de: " + maximo);
		System.out.println("A média entre esses valores é de: " + mediaInMaxEMin);

	}
		
}
