package LinguagemBasica;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2;
        //result is now 3
        System.out.println("1 + 2 = " + result);
        int originalResult = result;

        result -= 1;
        //result is now 2
        System.out.println(originalResult + " - 1 = " + result);
        originalResult = result;

        result *= 2;
        //result is now = 4
        System.out.println(originalResult + " * 2 = " + result);
        originalResult = result;

        result /= 2;
        //result is now 2
        System.out.println(originalResult + " / 2 = " + result);
        originalResult = result;

        result += 8;
        //result is now 10
        System.out.println(originalResult + " + 8 = " + result);
        originalResult = result;

        result %= 7;
        //result is now 3
        System.out.println(originalResult + " % 7 = " + result);

    }
}
