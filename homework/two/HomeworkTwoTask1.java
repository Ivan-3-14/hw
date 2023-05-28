package homework.two;

import java.util.Scanner;

public class HomeworkTwoTask1 {
    public static void main(String[] args) {

        int numberOfMonth = Month.valueOf("MAY").getMonthNumber();

        Scanner in = new Scanner(System.in);
        System.out.println("Please, add month number: ");
        int number = in.nextInt();

        String numOfMonth = Month.getMonthByNumber(number);
    }
}
