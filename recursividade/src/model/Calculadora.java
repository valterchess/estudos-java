package model;

import java.util.Scanner;

/**
 * Class responsável pela operação de cálculos simples
 * Contem apenas métodos estáticos
 * Com apenas um método publico
 * os metodos se relacionam por recursividade
 * onde um inicia o outro dentro da mesma operação
 * de acordo com a nescecidade e preferência do usuário
 * sem a utilização de laços de repetição
 */
public class Calculadora {

    /**
     * Método principal, responsável pela operação
     * solicita um valor ao usuário durante a operação
     * que será utilizado para identificar o tipo de operação desejada
     * de acordo com o valor informado o sistema executa uma
     * determinada operação através de um outro método
     * que por sua vez, ao ser finalizado,  executa outro método
     * que pergunta ao cliente se deseja finalizar a operação ou realizar novamente.
     */
    public static void calcula(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora básica.");
        System.out.println("Informe a operação que deseja realizar: "
                + "\n 1: soma (+)"
                + "\n 2: diferença (-)"
                + "\n 3: multiplicação (*))"
                + "\n 0: finalizar programa");

        int op = scan.nextInt();

        switch (op){
            case 1 -> soma();
            case 2 -> dif();
            case 3 -> mult();
            case 0 -> System.out.println("Obrigado, até breve!");
            default -> {
                System.out.println("Você informou um valor inválido");
                nova();
            }
        }
    }

    /**
     * método responsável por operar a soma de dois valores
     * solicitados durante o tempo de execução.
     * em seguida retornar o valor obtido na função
     * e chamar outro método que verifica a intensão do usuário
     */
    private static void soma(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Informe o primeiro número.");
        int n1 = scan.nextInt();
        System.out.println("Informe o primeiro número.");
        int n2 = scan.nextInt();
        int soma = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + soma);
        nova();
    }
    /**
     * método responsável por operar a diferensa entre dois valores
     * solicitados durante o tempo de execução.
     * em seguida retornar o valor obtido na função
     * e chamar outro método que verifica a intensão do usuário
     */
    private static void dif(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Informe o primeiro número.");
        int n1 = scan.nextInt();
        System.out.println("Informe o primeiro número.");
        int n2 = scan.nextInt();
        int dif = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + dif);
        nova();
    }
    /**
     * método responsável por operar a multiplicação de dois valores
     * solicitados durante o tempo de execução.
     * em seguida retornar o valor obtido na função
     * e chamar outro método que verifica a intensão do usuário
     */
    private static void mult(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Informe o primeiro número.");
        int n1 = scan.nextInt();
        System.out.println("Informe o primeiro número.");
        int n2 = scan.nextInt();
        int mult = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + mult);
        nova();
    }

    /**
     * método recursivo responsável
     * por validar a reinicialização da operação de calculo
     * de acordo com a intensão do usuário
     * o método chama o método calcula ou finaliza a operação
     *  de acordo com a intensão do usuário.
     *  caso inserido um valor diferente das opções do sistema
     *  ele dá um alerta e CHAMA A SI MESMO recursivamente
     *  repetindo o processo de solicitação de entrada de dados.
     */
    private static void nova(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja fazer uma nova operação?");
        System.out.println("1: sim\n" + "2: não");
        int resp = scan.nextInt();
        if (resp == 1)calcula();
        else if (resp == 2) System.out.println("Obrigado, até breve!");
        else {
            System.err.println("você inseriu um valor inválido");
            nova();
        }
    }
}
