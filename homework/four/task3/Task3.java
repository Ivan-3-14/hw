package homework.four.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String stopWord = "stop";
        String status = "status";
        List<Double> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Your number or \"stop-word\" or command \"status\" : ");
            if (scan.hasNextDouble()) {
                array.add(scan.nextDouble());
            } else if (scan.next().equalsIgnoreCase(status)) {
                Collections.sort(array);
                for (double counter : array) {
                    System.out.print(counter + " ");
                }
                System.out.println();
            }
            else  if (scan.next().equalsIgnoreCase(stopWord)) {
                break;
            }
            else {
                System.out.println("This is not a number!");
            }
        }
    }
}

