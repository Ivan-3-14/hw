package homework.four.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        double result;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please, enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Please, enter the second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Please, enter action( \" + \" , \" - \" , \"  / \", \" * \" )");
            String action = scanner.next();

            switch (action) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println("addition result: " + result);
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println("subtraction result: " + result);
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("division by zero");
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("division result: " + result);
                    }
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println("multiplication result: " + result);
                    break;
                default:
                    System.out.println("Please, check what are you enter!");

            }
        } catch (InputMismatchException e) {
            System.err.println("This is not a number! Please, check what are you enter! And restart this program");
        }
    }
}

