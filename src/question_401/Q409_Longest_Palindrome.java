package question_401;

import java.util.HashMap;
import java.util.Map;

public class Q409_Longest_Palindrome {
    public int longestPalindrome(String s) {
        // find how many chars has even occurance and pus at most 1 more odd occurence character
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c: arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        
        int odd = 0;
        int totalEven = 0;
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            
            totalEven += e.getValue();
            boolean isOdd = e.getValue()%2 == 1;
            if(isOdd) {
                odd = 1;  
                totalEven--;
            } 
        }
        
        return totalEven+odd;
    }
}
