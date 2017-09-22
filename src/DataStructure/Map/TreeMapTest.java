package DataStructure.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(
                Comparator.<String>naturalOrder()
        );
        Map<Integer, Integer> order = new TreeMap<>(
                Comparator.<Integer>naturalOrder()
//                (s1,  s2)->s1.compareTo(s2)

//                new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return 0;
//                    }
//                }
        );

        map.put("andy", 30);
        map.put("ben", 25);
        map.put("kevin", 40);
        map.put("lin", 10);
        map.put("evils", 35);

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
