package question_351;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
Design a data structure that supports all following operations in average O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.

*/
public class Q380_Insert_Delete_GetRandom_O1 {
    private Map<Integer, Integer> valueMap; // track <value, index>
    private Map<Integer, Integer> indexMap; // track <index, value>

    /**
     * Initialize your data structure here.
     */
    public Q380_Insert_Delete_GetRandom_O1() {
        indexMap = new HashMap();
        valueMap = new HashMap();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        boolean b = !valueMap.containsKey(val);

        if(b){
            // insert <k,v> into keyMap
            // insert <v,k> into valueMap
            int v = val;
            int index = valueMap.size() + 1;

            valueMap.put(v, index);
            indexMap.put(index, v);


        }
        System.out.println("insert " + val + " " + b);
        return b;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        boolean b = valueMap.containsKey(val);

        if(b) {
            // case 1: remove last element
            if(valueMap.get(val) == valueMap.size()){
                valueMap.remove(val);
                indexMap.remove(indexMap.size());
            }
            // case 2: get index of val, update map.index to last value
            else {
                int valAt = valueMap.get(val);

                int lastIndex = valueMap.size();
                int lastValue = valueMap.get(lastIndex);

                valueMap.remove(val);
                valueMap.put(lastValue, valAt); // move last value to where val at

                indexMap.remove(lastIndex);
                indexMap.put(valAt, lastValue);
            }
        }
        System.out.println("Remove " + val + " " + b);
        return b;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Random r = new Random();
        int random = r.nextInt(indexMap.size()) + 1;

        int result = indexMap.get(random);
        System.out.println(result);
        return result;
    }

    public void print() {
        System.out.println("value map: " + valueMap);
        System.out.println("index map: " + indexMap + "\n");
    }

    public static void main(String[] args) {
        Q380_Insert_Delete_GetRandom_O1 q = new Q380_Insert_Delete_GetRandom_O1();
        q.print();

        boolean b = q.insert(-1);
        q.print();
//        b = q.remove(2);
//        q.print();
        b = q.remove(-2);
        q.print();
        b = q.insert(-2);
        q.print();
        b = q.insert(8);
        q.print();
        b = q.insert(6);
        q.print();
        b = q.insert(2);
        q.print();
        b = q.insert(8);
        q.print();

q.getRandom();
    }
}
/*
use 2 hashmap
    1. map1 a->1 b->2 c->3
    2. map2 1->a 2->b 3->c

    getRandom -> generate a random number from 0 to map.size, return map2.get(r)
    insert -> if(map1 not has k) map1.put(k, map1.size) map2.put(map1.size, k)
    remove(k) -> get value i of k from map1, remove k from map1, set value of key i as last value and remove last entry from map2

*/