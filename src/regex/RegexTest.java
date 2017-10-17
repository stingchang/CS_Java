package regex;

import java.util.Scanner;
import java.util.regex.Matcher;

public class RegexTest {

    public static void main(String[] args) {
//
//        String pattern = "";
//        // '' or '1' or '1-' or '+1' or '+1-'      : 1{0,1} | 1-
//        String p1 = "(^\\+?1-?)?";
//        // '(333)' or '333' or '333-'
//        String p2 = "([\\d]{3}-?|\\([\\d]{3}\\))-?";
//        // '333' or '333-'
//        String p3 = "[\\d]{3}-?";
//        // 3333
//        String p4 = "[\\d]{4}$";
//
//
//        pattern = p1 + p2 + p3 + p4;
//        boolean result = false;
//        String line = "";
//
//        line = "13333333333";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "+13333333333";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "+1-3333333333";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "+1(333)3333333";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "+1(333)-3333333";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "+1(333)-333-3333";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
////
//        System.out.println();
//
//
//        pattern = "...\\....\\....\\....";
//        line = "abc.cda.cad.123";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//
//
//        pattern = "[0-9]{2,}$";
//        line = "1";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "422";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//
//        pattern = "([0-9]+)(?:st|nd|rd|th)?";
//        line = "1st";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "2nd";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//        line = "3r";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//
//        pattern = "^((Mr)|(Mrs)|(Ms)|(Dr)|(Er))\\\\.[a-zA-Z]+";
//        line = "Mr.V.K. Doshi";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");
//
//        pattern = "\\d[^\\d]";
//        line = "1w";
//        System.out.println(line + " matches " + pattern + " ? : " + line.matches(pattern) + "\n");


//        Matcher matcher = new Matcher("123");

        String t1 = "d((sd(sd)a(d";
        String pattern = "(";
        pattern = "[^(]*";
        int index =t1.indexOf(pattern);
        while(index>=0){
            System.out.println("fount: "+pattern+" at "+index+" ");
            index = t1.indexOf(pattern, index+1);
        }
    }
}
/*
* check cell phone number:
* 1-333-333-3333
* 333-333-3333
* 333333-3333
* 333-3333333
* 3333333333
* (333)-333-3333
* (333)333-3333
* (333)3333333
* 1(333)333-3333
* */


/*
* Rules
* .                 : and character
* \d \D             : digit and non digit
* \w \W             : word and non word
* \s \S             : space and non space character
* ^(input)$         : start and end of input line
* \A \Z             : beginning and end of input
* \b \B             : word and non word boundary
* a|b               : a or b
* [a-z0-9]          : one of "a to z or 0 to 9" character
* [^a-f]            : character not a to f
* [a-f[e-z]]        : union
* [a-f&&[e-g]]      : intersect: e, f
* [a-z&&[^b-d]]     : subtract: a, e-z
*
* ?                 : occurs 0 or 1 time
* *                 : occurs 0 + times
* +                 : occurs 1 + times
* {n} {n,} {n,m}    : occurs "n, at least n, n to m" times
*
* () (?:)           : group capturing and non group capturing
*
* (?=) (?!) (?<=) (?<!) : positive look forward, negative look forward, positive behind, negative look behind
* */