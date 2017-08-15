package CrackingCodingInterview1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    // sort 2 strings
    public static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // use hash map
    public static boolean isPermutation2(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        // construct map based on string 1
        for(int i =0; i< s1.length(); i++){
            Character c = s1.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        // check characters on string 2
        for(int i =0; i< s1.length(); i++){
            Character c = s2.charAt(i);
            if(!map.containsKey(c)){
                return false;
            } else {
                if(map.get(c) == 1){
                    map.remove(c);
                } else {
                    map.put(c, map.get(c)-1);
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "312";
        boolean isSame = isPermutation2(s1, s2);

        System.out.println(isSame);
    }
}