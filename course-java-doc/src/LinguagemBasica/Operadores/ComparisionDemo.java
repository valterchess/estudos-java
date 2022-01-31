package LinguagemBasica.Operadores;

public class ComparisionDemo {

    public static void main(String[] args) {
        int value = 1;
        int value2 = 2;

        if (value == value2){
            //igual
            System.out.println("valor1 == valor2");
        }
        //diferente
        if (value != value2) {
            System.out.println("valor1 != valor2");
        }
        //maior que
        if (value > value2){
            System.out.println("valor1 > valor2");
        }
        //menor que
        if (value < value2){
            System.out.println("valor1 < valor2");
        }
    }
}
