package homework.four.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

import static homework.four.task5.MatrixAction.*;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter dimension of matrix");

        try {
            int dimension = scanner.nextInt();
            double[][] matrix1;
            double[][] matrix2;
            double[][] matrixSum;
            double[][] matrixDif = new double[dimension][dimension];

            System.out.println("Please, enter values of elements of first matrix");
            matrix1 = createMatrix(dimension, scanner);
            System.out.println();

            System.out.println("Please, enter values of elements of second matrix");
            matrix2 = createMatrix(dimension, scanner);

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrixDif[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            matrixSum = summOfMatrix(matrix1, matrix2);
            System.out.println("Matrix Sum:");
            printMatrix(matrixSum);

            System.out.println("Matrix Difference:");
            printMatrix(matrixDif);

        } catch (InputMismatchException e) {
            System.err.println("This is not a number! Please, check what are you enter!");
        }
    }
}


