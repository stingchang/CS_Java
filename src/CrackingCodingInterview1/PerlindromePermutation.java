package CrackingCodingInterview1;

import java.util.HashMap;
import java.util.Map;

public class PerlindromePermutation {
    public boolean check(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == ' ')
                continue;
            if(map.containsKey(c)){
                map.remove(c);
            } else {
                map.put(c,1);
            }
        }
        return map.size() <=1;
    }

    public static void main(String[] args){
        PerlindromePermutation p = new PerlindromePermutation();
        String input = "taco cato";
        System.out.println(p.check(input));

    }
}
