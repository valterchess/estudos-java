import java.util.Random;

public class Random1 {

    public static void main(String[] args) {

        //instancia um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        System.out.println(gerador.nextInt());

        //imprime sequência de 10 números inteiros aleatórios
        //for (int i = 0; i < 10; i++) {
          //  System.out.println(gerador.nextInt());
        //}
    }
}