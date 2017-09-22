package question_001;

import java.util.Arrays;

public class Q005_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int len = s.length();
        // 1. create an array as #a#b# type based on s
        char[] arr = new char[len * 2 + 1];
        for (int i = 0; i < len; i++) {
            arr[2 * i] = '#';
            arr[2 * i + 1] = s.charAt(i);
        }
        arr[2 * len] = '#';

        // 2.1 find largest palindrome and memorize center
        int maxExpand = 0, center = 0;
        for (int i = 0; i < arr.length; i++) {
            int exp = 1;
            while (isSymmetric(arr, i, exp)) exp++;
            // exp is 1 step further   ebcbd exp=2-> need to minus 1
            exp--;
            // 2.2 update maxExpand
            if (exp > maxExpand) {
                maxExpand = exp;
                center = i;
            }
        }
        /*
          #b#c#b# / #b#c#c#b#
        */
        System.out.println(Arrays.toString(arr));
        System.out.println("maxExpand = " + maxExpand + "center" + center);
        // 3. pick only even characters from result
        StringBuilder sb = new StringBuilder();

        int index = center - maxExpand + 1;
        while (index <= center + maxExpand - 1) {
            sb.append(arr[index]);
            index += 2;
        }
        return sb.toString();
    }

    public boolean isSymmetric(char[] arr, int center, int exp) {
        return center - exp >= 0 && center + exp <= arr.length - 1 && arr[center - exp] == arr[center + exp];
    }
}
/*
1.
insert special character # between each characters
2.
initialize expand = 0
for each index i, if( substring from (i-expand-k)~(i+expand+k)) is palindrom, update expand to expand+k
memorize i when expand is updated
3.
from step 2 we get 2 types of palindrom: #b#c#b#  or  #b#c#c#b#
we pick only characters in even position
*/
