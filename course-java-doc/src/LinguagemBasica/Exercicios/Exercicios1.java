package LinguagemBasica.Exercicios;

public class Exercicios1 {
    public static void main(String[] args) {
        int i = 10;
        //calcula o resto da divisão de i por 5 e adiciona 1 a i
        int n = i++ % 5;
        System.out.println(i + "\n" + n);
    }
}
