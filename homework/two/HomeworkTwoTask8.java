package homework.two;

import java.util.regex.Pattern;

public class HomeworkTwoTask8 {
    public static void main(String[] args) {

        var stringWithNumberOfCard = "Number of my credit card 1234-5678-9876-5432. But, I don't use it!";

        var pattern = Pattern.compile("(\\d{4}\\-{1}){3}\\d{4}");
        var matcher = pattern.matcher(stringWithNumberOfCard);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
