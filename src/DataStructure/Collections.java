package DataStructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args){
        mapTest();
    }

    // Map LinkedHashMap HashMap
    public static void mapTest(){
        System.out.println("LinkedHashMap:  ");
        Map<Integer, Integer> map1 = new LinkedHashMap<>();
        map1.put(6,6);map1.put(4,4);
        map1.put(2,2);map1.put(7,7);map1.put(0,0);
        map1.put(3,3);map1.put(8,8);
        map1.forEach((k,v) -> System.out.print("("+k+","+v+")"));
        System.out.println();
        map1.replace(2, 3);
        System.out.println(map1);
        Set<Map.Entry<Integer, Integer>> entry = map1.entrySet();
//        for(Map.Entry<Integer, Integer> s:map1.entrySet()){
//
//        }
        map1.mer
        // compute computeIfAbsent computeIfPresent
        // merge
        // get getOrDefault(k, v) replace(k, v) replaceAll()

        System.out.println();
        System.out.println("HashMap:  ");
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        map2.put(6,6);map2.put(4,4);map2.put(0,0);
        map2.put(2,2);map2.put(7,7);map2.put(1,1);
        System.out.println(map2);
    }

    // TreeSet LinkedHashSet HashSet
    public static void setTest(){

    }

    // ArrayList LinkedList
    public static void listTest(){

    }

    // Deque Queue
    public static void queueTest(){

    }
}
