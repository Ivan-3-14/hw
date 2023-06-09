package homework.four.task6;

import java.io.*;
import java.util.Scanner;

import static homework.four.task6.MatrixAction.*;

public class Task6 {
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task6\\INPUT");
        Scanner scanner = new Scanner(file);
        int dimension = scanner.nextInt();
        int[][] matrix1 = new int[dimension][dimension];
        int[][] matrix2 = new int[dimension][dimension];
        int[][] matrixSum;
        int[][] matrixDif = new int[dimension][dimension];
        int count = 0;
        scanner.next();

        while (scanner.hasNextInt()) {
            count++;
            if (count <= 1) {
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        matrix1[i][j] = scanner.nextInt();
                    }
                }
            } else {
                for (int i = 0; i < matrix2.length; i++) {
                    for (int j = 0; j < matrix2[i].length; j++) {
                        matrix2[i][j] = scanner.nextInt();
                    }
                }
            }
        }
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
        scanner.close();
    }
}
