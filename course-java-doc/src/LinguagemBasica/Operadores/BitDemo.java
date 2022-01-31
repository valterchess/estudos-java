package LinguagemBasica.Operadores;

public class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        //imprime 2
        System.out.println(val & bitmask);
    }
}
