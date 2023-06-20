package homework.four.task6;

import java.util.Scanner;

public class MatrixAction {

    static int[][] matrix;

    public static int[][] getMatrix() {
        return matrix;
    }

    public static void setMatrix(int[][] matrix) {
        MatrixAction.matrix = matrix;
    }

    public MatrixAction(int first, int second, Scanner s){
         matrix = new int[first][second];
        for(int i = 0; i < matrix.length; ++i)
            for(int j = 0; j < matrix[i].length; ++j)
                matrix[i][j] = s.nextInt();
    }

    public static int[][] summOfMatrix(int[][] m1, int[][] m2) {
        int[][] matrixSum = m1;
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                matrixSum[i][j] += m2[i][j];
            }
        }
        return matrixSum;
    }

    public static int[][] difOfMatrix(int[][] m1, int[][] m2) {
        int[][] matrixDif = m1;
        for (int k = 0; k < matrixDif.length; k++) {
            for (int l = 0; l < matrixDif[k].length; l++) {
                matrixDif[k][l] -= m2[k][l];
            }
        }
        return matrixDif;
    }

    public static void printMatrix(int[][] matrix){
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.print(element + "  ");
            }
            System.out.println("");
        }
    }


}
