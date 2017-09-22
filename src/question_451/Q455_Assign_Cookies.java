package question_451;

import java.util.Arrays;

public class Q455_Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0, sIndex = 0, count = 0;
        while(gIndex<g.length && sIndex<s.length){
            if(g[gIndex]<=s[sIndex]){
                count++;
                gIndex++;
                sIndex++;
            } else {
                sIndex++;
            }
        }
        return count;
    }
}

