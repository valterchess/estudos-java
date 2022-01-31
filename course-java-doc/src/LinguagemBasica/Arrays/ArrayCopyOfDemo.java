package LinguagemBasica.Arrays;
import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String [] copyFrom = {"Affogato", "Americano", "Cappuccino",
                "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino",
                "Freddo", "lungo", "Macchiato", "Marocchino", "Ristretto"};

        String [] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee: copyTo) {
            System.out.print(coffee + " ");
        }

        System.out.println("\n" + copyTo.length);
    }
}
