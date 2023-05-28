package homework.two;

import java.util.regex.Pattern;

public class HomeworkTwoTask5 {
    public static void main(String[] args) {

        var stringWithThreeC = "I don't now about bicyclic accuracy calcific of serum";

        var pattern = Pattern.compile("\\w*\\-?(\\w*c){3,}");
        var matcher = pattern.matcher(stringWithThreeC);
        int amount = 0;

        while (matcher.find()) {
            amount++;
        }
    }
}
