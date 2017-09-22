package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPattern {
    public static void main(String[] args) {
        String input = "abc123 af 23 af 3 sa dfsf323 df";
        Pattern pattern = Pattern.compile("[\\w\\W]+(23)\\s");
        Matcher matcher = pattern.matcher(input);

        String[] tokens = pattern.split(input);
        for (String s : tokens) {
            System.out.println("Token: " + s);
        }
        System.out.println();
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println();
        int index = input.indexOf("23");
        while (index >= 0) {
            System.out.print(index + " ");
            index = input.indexOf("23", index + 1);
        }
    }
}
