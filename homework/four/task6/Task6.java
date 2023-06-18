package homework.four.task6;

import java.io.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task6\\INPUT");

        try {
            Scanner scanner = new Scanner(file);
            int dimension = scanner.nextInt();
            int[][] matrix1 = new int[dimension][dimension];
            int[][] matrix2 = new int[dimension][dimension];
            int[][] matrixSum = new int[dimension][dimension];
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
                    matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                    matrixDif[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            System.out.println("Matrix Sum:");
            for (int[] array : matrixSum) {
                for (int element : array) {
                    System.out.print(element + "  ");
                }
                System.out.println("");
            }
            System.out.println("Matrix Difference:");
            for (int[] array : matrixDif) {
                for (int element : array) {
                    System.out.print(element + "  ");
                }
                System.out.println("");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error! File Not Found!");
        } catch (IOException e) {
            System.err.println("Error!" + " " + e);
        }
    }
}
