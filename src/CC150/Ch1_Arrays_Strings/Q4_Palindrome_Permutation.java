package CC150.Ch1_Arrays_Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q4_Palindrome_Permutation {
    public boolean isPerlindrome(String str) {
        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : arr) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return set.size() <= 1;
    }
}

// Tact Coa -> true
// Taco cat <-> atco cta
