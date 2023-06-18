package homework.four.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String stopWord = "stop";

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Your integer number : ");
            out:
            if (sc.hasNextInt()) {
                list.add(sc.nextInt());
            } else {
                if (sc.next().equalsIgnoreCase(stopWord)) {
                    double summ = 0;
                    double average;
                    for (int i = 0; i < list.size(); i++) {
                        summ += list.get(i);
                    }
                    average = (summ) / (list.size());
                    if (list.size() == 0) {
                        System.out.println("values were not entered!");
                        break out;
                    } else {
                        System.out.println("average value : " + average);
                    }
                    break;
                } else {
                    System.out.println("This is not an integer number!");
                }
            }
        }
    }
}
