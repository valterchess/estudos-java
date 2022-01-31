package LinguagemBasica.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        String [] copyFrom = {"Affogato", "Americano", "Cappuccino",
        "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino",
        "Freddo", "lungo", "Macchiato", "Marocchino", "Ristretto"};


        String [] copyTo = new String [7];
        System.arraycopy(copyFrom, 2, copyTo,0,7);
        for (String coffee: copyTo) {
            if (coffee != null) {
                System.out.print(coffee + " ");
            }
        }
    }
}
