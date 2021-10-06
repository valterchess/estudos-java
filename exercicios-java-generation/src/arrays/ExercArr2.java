package arrays;
import java.util.Scanner;

public class ExercArr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];

        //dados de saída
        int totalimpar = 0, somaPar = 0;

        //alimentando o array e as variáveis
        for (int i = 0; i < array.length; i++){
            System.out.println("\nEntre com um número: ");
            array[i]= scan.nextInt();

            if (array[i] % 2 == 0 && array[i] != 0){
                somaPar += array[i];
            } else {
                if (array[i] != 0){
                    totalimpar++;
                }
            }
        }
        //imprimindo números pares
        System.out.print("\nNúmeros pares: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        //imprimindo números impares
        System.out.print("\nNúmeros impares: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 && array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.printf("\nA soma dos valores pares informado é: %d",somaPar);
        System.out.printf("\nForam informados %d números impares.",totalimpar);
    }
}
