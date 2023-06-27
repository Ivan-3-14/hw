package homework.One;

public class HwOneTask4 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][6];
        int positive = 0;
        int negative = 0;
        System.out.println("sourse array: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0, n = -1; j < matrix[i].length; j++, n = n + 3) {
                matrix[i][j] = i - j + n;
                System.out.print(matrix[i][j] + "   ");
                if (matrix[i][j] > 0) {
                    positive++;
                } else {
                    if (matrix[i][j] < 0) {
                        negative++;
                    } else {
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        if (positive > negative) {
            System.out.println("more positive numbers: " + positive);
        } else {
            if (positive < negative) {
                System.out.println("more negative numbers: " + negative);
            } else {
                System.out.println("positive numbers = negative numbers ");
            }
        }
    }
}
