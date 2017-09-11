package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInString {
    public static void main(String[] args) {
        String i1 = "dfsfs980sdf123poier110poipoikkj-10"; // output = [980, 123, 110]
        String i2 = "dfsfs980sdf123poier110poipoikkj-10";
        String i3 = "-3-3df-4sf-4s-3sdf80s9df123poier110poipoikkj-10.9";

        List<Integer> l1 = findNumbers(i1);
        List<Integer> l2 = findNumbers(i2);
        List<Integer> l3 = findNumbers(i3);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println();
        System.out.println(l3);
        Collections.sort(l3);
        Collections.reverse(l3);
        System.out.println(l3);

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Set<Integer>> mapByFreq = new HashMap<>();
        Set<Integer> freq = new TreeSet<>();
        mapByFreq(l3, map, freq, mapByFreq);
        System.out.println(map);
//        Collections.sort(freq);

        System.out.println(freq);
        System.out.println(mapByFreq);
    }

    public static void mapByFreq(List<Integer> list, Map<Integer, Integer> map, Set<Integer> freq, Map<Integer, Set<Integer>> mapByFreq) {

        for (int i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i : map.keySet()) {
            int f = map.get(i);
            if (mapByFreq.containsKey(map.get(i))) {
                mapByFreq.get(f).add(i);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(i);
                mapByFreq.put(f, set);
            }
        }


        for (int i : map.keySet()) {
            freq.add(map.get(i));
        }

    }


    public static List<Integer> findNumbers(String input) {
        String patt = "-?\\d+";
        Pattern p = Pattern.compile(patt);
        Matcher m = p.matcher(input);
        System.out.println("count : " + m);
        List<Integer> list = new ArrayList<>();
        while (m.find()) {
//            System.out.println("ans: "+m.group());
            list.add(Integer.parseInt(m.group()));
        }

        return list;
    }
}

/*
* o1. int in string(regex pattern matcher)
* 2. design calendar class 有 day year month 实现 add (days) return calendar
* 3. what happens when click enter on browser
* o4. max rectangle LC85
* o5. String encode/decode
* o6. find min value in a rotated sorted array(153 154 33 81)
* 7. backend server knowledge
* o8. Calculate the distance of bits between two integers.(461) For example: 1 -> 01; 2 -> 10; dist = 2;
* o9. Fibonacci, recursive + non recursive;
* 10. java javascript oop
* 11. 打印一个数成它prime相乘的结果，例如12 = 2^2*3.
* 12. Valid Number LC 65    http://www.cnblogs.com/springfor/p/3893598.html
* 13. Android Unlock Patterns LC 351    http://blog.csdn.net/jmspan/article/details/51487231
*
* - bipartite->bfs
* - unfair coins
* - kd-tree
* - walls and gates
* */