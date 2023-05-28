package homework.two;

import java.util.regex.Pattern;

public class HomeworkTwoTask7 {
    public static void main(String[] args) {

        var stringWithBeginAndEndA = " Triumphalnaya arkan odno iz proizveneniy Remarka ";

        var pattern = Pattern.compile("\\ba+\\w*a+\\b");
        var matcher = pattern.matcher(stringWithBeginAndEndA);
        boolean result = false;

        while (matcher.find()) {
            result = true;
        }

        if (result == true) {
            System.out.println("This string have words that begin and end with a letter \"a\"");
        } else {
            System.out.println("Words that begin and end with a letter \"a\" not found");
        }
    }
}
