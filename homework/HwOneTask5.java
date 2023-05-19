package homework;

public class HwOneTask5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 0},
                {3, 5, 0, 0},
                {2, 4, 8, 0},
                {4, 7, 9, 1}
        };
        int i, j;
        int summ = 0;

        for (int[] ints : matrix) {
            for (j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        out:
        for (j = 1; j < matrix.length; j++) {
            for (i = 0; i < j; i++) {
                if (matrix[i][j] != 0) {
                    System.out.println("No lower tringular matrix");
                    summ += matrix[i][j];
                    break out;
                } else {
                }
            }
        }
        if (summ == 0) {
            System.out.println("lower tringular matrix");
        }
    }
}
