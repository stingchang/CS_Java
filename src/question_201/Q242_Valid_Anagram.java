package question_201;

import java.util.Arrays;

public class Q242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if(s == null && t ==null) return true;
        if(s.length() != t.length()) return false;
        
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for(int i = 0; i< s.length(); i++){
            a1[s.charAt(i) - 'a']++;
            a2[t.charAt(i) - 'a']++;
        }
        
        return Arrays.equals(a1, a2);
    }
}
