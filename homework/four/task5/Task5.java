package homework.four.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter dimension of matrix");

        try {
            int dimension = scanner.nextInt();
            double[][] matrix1 = new double[dimension][dimension];
            double[][] matrix2 = new double[dimension][dimension];
            double[][] matrixSum = new double[dimension][dimension];
            double[][] matrixDif = new double[dimension][dimension];

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    System.out.println("Please, enter value of element of first matrix");
                    matrix1[i][j] = scanner.nextDouble();
                }
            }

            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    System.out.println("Please, enter value of element of second matrix");
                    matrix2[i][j] = scanner.nextDouble();
                }
            }

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                    matrixDif[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            System.out.println("Matrix Sum:");
            for (double[] array : matrixSum) {
                for (double element : array) {
                    System.out.print(element + "  ");
                }
                System.out.println("");
            }

            System.out.println("Matrix Difference:");
            for (double[] array : matrixDif) {
                for (double element : array) {
                    System.out.print(element + "  ");
                }
                System.out.println("");
            }
        } catch (InputMismatchException e) {
            System.err.println("This is not a number! Please, check what are you enter! and restart this program");
        }
    }
}

