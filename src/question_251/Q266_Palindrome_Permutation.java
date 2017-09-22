package question_251;

import java.util.HashSet;
import java.util.Set;

public class Q266_Palindrome_Permutation {
    public boolean canPermutePalindrome(String s){
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(set.contains(c)) set.remove(c);
            else set.add(c);
        }
        return set.size()<=1;
    }

}
