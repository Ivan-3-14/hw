package homework.re_two_rn;

import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        String stringFromTaskOne = "I make 5 mistakes in my homework 29 days ago, and have more 100 reasons for it 29.06.2023";
        String longesNumber = null;

        var pattern = Pattern.compile("\\d*");
        var matcher = pattern.matcher(stringFromTaskOne);

        while (matcher.find()) {
            int length = matcher.end() - matcher.start();
            if (longesNumber == null || longesNumber.length() < length) {
                longesNumber = stringFromTaskOne.substring(matcher.start(), matcher.end());
            }
        }

        if (longesNumber.equals("")) {
            System.out.println("This text haven't numbers : ");
        } else {
            System.out.println("Max number of consecutive digits");
            System.out.println(longesNumber);
        }
    }
}