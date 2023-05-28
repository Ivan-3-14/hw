package homework;

public class HwOneTask1 {
    public static void main(String[] args) {
        int n = 0;
        int[] array = {1, 6, 8, 4, 2, 9, 3, 5, 15, 7, 67, 19};
        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                continue;
            }
            summ += array[i];
        }
        System.out.println(summ);

    }
}
