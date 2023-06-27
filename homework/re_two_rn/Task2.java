package homework.re_two_rn;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        String stringFromTaskTwo =
                " Listen to the   news from today and read the  text at the same time. " +
                        "Listen to the news from today without reading the text. ";
        Set<String> setOfUniqueWord = new HashSet<>();
        int result;

        var pattern = Pattern.compile("\\b\\w+\\b");
        var matcher = pattern.matcher(stringFromTaskTwo);

        while (matcher.find()) {
           String uniqueWord = stringFromTaskTwo.substring(matcher.start(), matcher.end());
            setOfUniqueWord.add(uniqueWord.toUpperCase());
        }
        result = setOfUniqueWord.size();
        System.out.println(result);
    }
}
