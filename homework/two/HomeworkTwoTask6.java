package homework.two;

import java.util.regex.Pattern;

public class HomeworkTwoTask6 {
    public static void main(String[] args) {

        var stringFromTaskSix = " This homework have a many difficult tasks";

        var pattern = Pattern.compile("\\w*");
        var matcher = pattern.matcher(stringFromTaskSix);
        String result;
        String longesWord = null;

        while (matcher.find()) {
            int leght = matcher.end() - matcher.start();
            if (longesWord == null || longesWord.length() < leght) {
                longesWord = stringFromTaskSix.substring(matcher.start(), matcher.end());
            }
        }
        result = longesWord;
    }
}
