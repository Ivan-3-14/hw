package homework.re_two_rn;

import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        String stringFromTaskOne = "I make 5 mistakes in my homework 29days ago, and have more 100 reasons for it 27.06.2023";
        String result;
        String longesNumber = null;

        var pattern = Pattern.compile("\\d*");
        var matcher = pattern.matcher(stringFromTaskOne);

        while (matcher.find()) {
                int length = matcher.end() - matcher.start();
                if (longesNumber == null || longesNumber.length() < length) {
                    longesNumber = stringFromTaskOne.substring(matcher.start(), matcher.end());
                }
            }
            result = longesNumber;
    }
}