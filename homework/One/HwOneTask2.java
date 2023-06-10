package homework.One;

public class HwOneTask2 {
    public static void main(String[] args) {
        long n = 7L;
        long i = 0L;
        long j = 1L;
        long k = 0L;
        long total = 0L;
        long count = 0L;

        for (; count < n; k = j, j = i, i = j + k, count++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("");
        System.out.println("summ of even number = " + total);
    }
}
