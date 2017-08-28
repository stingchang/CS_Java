package question_201;

import java.util.HashMap;
import java.util.Map;

public class Q205_Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        if(a1.length != a2.length)
            return false;

        Map<Character, Character> aToB = new HashMap<>();
        Map<Character, Character> bToA = new HashMap<>();
        for(int i = 0; i<a1.length; i++){
            char c1 = a1[i];
            char c2 = a2[i];

            // System.out.println("c1 c2 = "+c1+" "+c2);
            if(!aToB.containsKey(c2)){
                aToB.put(c2, c1);
            }
            if(!bToA.containsKey(c1)){
                bToA.put(c1, c2);
            }

            if(aToB.get(c2) != c1) {
                return false;
            }
            if(bToA.get(c1) != c2) {
                return false;
            }
        }

        return true;
    }
}
