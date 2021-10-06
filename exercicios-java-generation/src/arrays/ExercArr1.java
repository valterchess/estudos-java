package arrays;

public class ExercArr1 {
    public static void main(String[] args) {
        int[] array = {1, 0, 5, -2, -5, 7};
        int soma = array[0] + array[1] + array[5];
        array[4] = 100;
        for (int i = 0;i < array.length;i++){
            if (i == 5) {
                System.out.print(array[i] + ".");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
