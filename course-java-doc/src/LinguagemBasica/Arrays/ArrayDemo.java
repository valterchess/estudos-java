package LinguagemBasica.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //declaração do array
        int [] anArray;

        //alocando memória ao array
        anArray = new int[10];

        //iniciando o primeiro elemento
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = 100 * (i + 1);
        }

        for(int i = 0; i < anArray.length; i++) {
            System.out.println("Elemento no indice " + i +
                    ": " + anArray[i]);
        }
    }
}
