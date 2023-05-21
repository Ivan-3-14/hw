package homework;

import java.util.Arrays;
public class HwOneTask3 {
    public static void main(String[] args) {
        int[] array = {1, 6, 8, 4, 2, 9, 3, 5, 15, 7, 67, 19};
        System.out.println("sourse array: ");
        System.out.println( Arrays.toString(array));

        int[] arrayInv = new int[array.length];
        System.out.println(" ");
        System.out.println("inverted array: ");

        for (int i = 0, n = array.length-1; i < array.length; i++, n--) {
            arrayInv[i] = array[n];
            System.out.print(arrayInv[i] + "  ");
        }
    }
}
