package homework.two;

import java.lang.String;

public class HomeworkTwoTask9 {
    public static void main(String[] args) {

        String stringWithSomeWord = "This is penultimate task in our homework";
        int index = stringWithSomeWord.indexOf("task");

        if (index < 0) {
            System.out.println("this word was not found");
        } else {
            System.out.println("this word found, index of it's first character: " + index);
        }
    }

}
