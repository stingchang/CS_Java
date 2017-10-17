package question_051;

import java.util.HashMap;
import java.util.Map;

public class Q076_Minimum_Window_Substring {
    public String minWindow(String source, String target) {
        // write your code
        HashMap<Character, Integer> map = new HashMap<>();
        int countT = target.length();
        for(int i = 0; i < target.length(); i++){
            char c = target.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        int j = 0;
        int countS = 0;
        int min = Integer.MAX_VALUE;
        String result  = "";
        for(int i = 0;  i < source.length(); i++){
            while(j < source.length() && countS < countT){
                char c = source.charAt(j);
                if(map.containsKey(c)){
                    if( map.get(c) > 0) countS++;
                    map.put(c, map.get(c) - 1);
                }
                j++;
            }
            if(countS >= countT){
                if(j - i < min){
                    result = source.substring(i, j);
                    min = j - i;
                }
            }
            char cc = source.charAt(i);
            if(map.containsKey(cc)){
                if(map.get(cc) >= 0){
                    countS--;
                }
                map.put(cc, map.get(cc) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Q076_Minimum_Window_Substring q = new Q076_Minimum_Window_Substring();
        String a = "bdab";
        String b = "ab";
        String s = q.minWindow(a, b);
        System.out.println("Ans : " + s);
    }
}
/*
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".
*/