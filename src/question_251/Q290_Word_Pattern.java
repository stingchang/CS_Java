package question_251;

import java.util.HashMap;
import java.util.Map;

public class Q290_Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null && str == null) return true;
        if (pattern == null || str == null) return false;

        char[] mapKeyA = pattern.toCharArray();
        String[] mapKeyB = str.split(" ");
        if (mapKeyA.length != mapKeyB.length) return false;
        //   System.out.println(Arrays.toString(mapKeyA));
        //   System.out.println(Arrays.toString(mapKeyB));

        Map<Character, String> mapA = new HashMap<>();
        Map<String, Character> mapB = new HashMap<>();
        for (int i = 0; i < mapKeyB.length; i++) {
            //System.out.print("A: "+mapKeyA[i]);
            //System.out.println(", B: "+mapKeyB[i]);
            if (mapA.containsKey(mapKeyA[i]) && !mapA.get(mapKeyA[i]).equals(mapKeyB[i])) {
                // System.out.println("A : "+mapKeyA[i]+","+mapA.get(mapKeyA[i]));
                return false;
            }
            if (mapB.containsKey(mapKeyB[i]) && !mapB.get(mapKeyB[i]).equals(mapKeyA[i])) {
                //System.out.println("B : "+mapKeyB[i]+","+mapB.get(mapKeyB[i]));
                return false;
            }

            mapA.put(mapKeyA[i], mapKeyB[i]);
            mapB.put(mapKeyB[i], mapKeyA[i]);
        }
        return true;

    }
}
