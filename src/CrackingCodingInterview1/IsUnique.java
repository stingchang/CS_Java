package CrackingCodingInterview1;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public boolean isUnique(String str){
        Set<Character> set = new HashSet<>();

        char[] arr = str.toCharArray();
        for(char c: arr){
            set.add(c);
        }

        return set.size() == arr.length;

    }
    public static void main(String[] args){
        int a = 1;
        System.out.println(a++);
    }
}
