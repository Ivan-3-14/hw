package homework;

public class HwOneTask6 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {3, 5, 1, 5},
                {2, 4, 6, 0},
                {4, 2, 9, 1}
        };
        int[][] matrix2 = {
                {2, 7, 6, 2},
                {1, 2, 7, 0},
                {3, 5, 3, 4},
                {1, 7, 0, 2}
        };
        int[][] matrixResult = new int[4][4];
        System.out.println();
        System.out.print("Summ Matrixs Result: ");
        for (int i = 0; i < matrixResult.length; i++) {
            System.out.println();
            for (int j = 0; j < matrixResult[i].length; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrixResult[i][j] + "   ");
            }
        }
        System.out.println("  ");
        System.out.print("Difference Matrixs Result: ");
        for (int i = 0; i < matrixResult.length; i++) {
            System.out.println();
            for (int j = 0; j < matrixResult[i].length; j++) {
                matrixResult[i][j] = matrix2[i][j] - matrix1[i][j];
                System.out.print(matrixResult[i][j] + "   ");
            }
        }
    }
}
