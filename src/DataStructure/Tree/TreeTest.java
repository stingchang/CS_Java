package DataStructure.Tree;

import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class TreeTest {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(4,2);
        map.put(1,3);
        map.put(2,5);
        map.put(6,4);

//        Map<Integer, Integer> part = map.

        String s = "-134k";
        String pattern = "-1?\\d+";
        System.out.println(s.matches(pattern));

        double d1 = 3;
        double d2 = 2.8;
        System.out.print(d1+" "+d2+" "+((d1+d2)/2));
    }
}
