package LinguagemBasica.ControleDeFluxo;

public class IfElseDemo {
    public static void main(String[] args) {
        int testscore = 76;
        int nota;

        if (testscore >= 90) {
            nota = 'A';
        } else if (testscore >= 80) {
            nota = 'B';
        } else if (testscore >= 70) {
            nota = 'C';
        } else if (testscore >= 60) {
            nota = 'D';
        } else {
            nota = 'F';
        }
        System.out.println("Nota: " + nota
                + "\n Por apresentar um teste com " + testscore + "% de aproveitameto");
    }
}
