import javax.swing.*;
import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("введите (x) первую координату центра круга");
        int x = scan.nextInt();

        System.out.println("введите (y) вторую координату центра круга");
        int y = scan.nextInt();

        System.out.println("введите (r) длину радиуса круга");
        int r = scan.nextInt();

        System.out.println("введите (a) первую координату точки");
        int a = scan.nextInt();

        System.out.println("введите (b) вторую координату точки");
        int b = scan.nextInt();

        System.out.println();


        if ((a - x) * (a - x) + (b - y) * (b - y) <= r * r) {
            System.out.println("точка принадлежит кругу");
        } else {
            System.out.println("точка не принадлежит кругу");
        }
    }
}

