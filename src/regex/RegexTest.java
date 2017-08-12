package regex;

import java.util.Scanner;

public class RegexTest {

    public static void main(String[] args) {
        String pattern = "[0]+";

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        boolean result = line.matches(pattern);

        System.out.println("Match ? " + result);

    }
}


