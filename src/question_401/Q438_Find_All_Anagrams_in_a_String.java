package question_401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q438_Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> locations = new ArrayList<>();
        int lenP = p.length();
        int lenS = s.length();
        if (lenP > lenS) return locations;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        // construct base case
        for (int i = 0; i < lenP; i++) {
            char c2 = p.charAt(i);
            if (map2.containsKey(c2)) {
                map2.put(c2, map2.get(c2) + 1);
            } else {
                map2.put(c2, 1);
            }

            char c1 = s.charAt(i);
            if (map1.containsKey(c1)) {
                map1.put(c1, map1.get(c1) + 1);
            } else {
                map1.put(c1, 1);
            }
        }
//        System.out.println("map1: "+map1);
//        System.out.println("map2: "+map2);
        if (map1.equals(map2)) locations.add(0);
//        System.out.println("locations: "+locations);


        for (int i = lenP; i < lenS; i++) {
            char newChar = s.charAt(i);
            if (map1.containsKey(newChar)) map1.put(newChar, map1.get(newChar) + 1);
            else map1.put(newChar, 1);

            int firstLocation = i - lenP;
            char beginChar = s.charAt(firstLocation);
            if (map1.get(beginChar) == 1) map1.remove(beginChar);
            else map1.put(beginChar, map1.get(beginChar) - 1);

            if (map1.equals(map2)) locations.add(firstLocation + 1);
        }


        return locations;
    }
}
