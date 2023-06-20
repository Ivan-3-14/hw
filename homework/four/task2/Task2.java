package homework.four.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String stopWord = "stop";
        int summ = 0;
        double coinStep = 0.0;
        double average;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please, add your integer number or \"stop-word\": ");
            if (sc.hasNextInt()) {
                summ += Integer.parseInt(sc.next());
                coinStep++;
            } else {
                if (sc.next().equalsIgnoreCase(stopWord)) {
                    if (coinStep == 0) {
                        average = 0;
                    } else {
                        average = summ / coinStep;
                    }
                    System.out.println("average value : " + average);
                    break;
                } else {
                    System.out.println("This is not an integer number!");
                }
            }
        }
    }
}
