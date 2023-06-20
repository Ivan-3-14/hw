package homework.four.task5;

import java.util.Scanner;

public class MatrixAction {

    static double[][] matrix;

    public static double[][] getMatrix() {
        return matrix;
    }

    public static void setMatrix(double[][] matrix) {
        MatrixAction.matrix = matrix;
    }

    public MatrixAction(int first, int second, Scanner s){
         matrix = new double[first][second];
        for(int i = 0; i < matrix.length; ++i)
            for(int j = 0; j < matrix[i].length; ++j)
                matrix[i][j] = s.nextDouble();
    }

    public static double[][] createMatrix(int d, Scanner s) {
        matrix = new double[d][d];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = s.nextDouble();
        }
    }
        return matrix;
    }

    public static double[][] summOfMatrix(double[][] m1, double[][] m2) {
        double[][] matrixSum = m1;
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                matrixSum[i][j] += m2[i][j];
            }
        }
        return matrixSum;
    }

    public static void printMatrix(double[][] matrix){
        for (double[] array : matrix) {
            for (double element : array) {
                System.out.print(element + "  ");
            }
            System.out.println("");
        }
    }


}
