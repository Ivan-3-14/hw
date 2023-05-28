package homework.two;

public class Consumer {

    private int arr[] = {0, 0, 0, 0, 0};

    public void consume(int value) {
        for (int n = 0; n < 5  ; n++) {
            if (n < 5) {
                arr[n] = value;
            }
            else {
                arr[(n % 10) - 5] = value;
            }
            return;
        }
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
