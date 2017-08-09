package question_301;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q350_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums1){
            if(map1.containsKey(i)){
                map1.put(i, map1.get(i)+1);
            } else {
                map1.put(i, 1);
            }
        }
        for (int i : nums2){
            if(map2.containsKey(i)){
                map2.put(i, map2.get(i)+1);
            } else {
                map2.put(i, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int k: map1.keySet()){
            if(map2.containsKey(k)){
                int occ = Math.min(map1.get(k), map2.get(k));
                for(int i =0; i<occ; i++)
                    list.add(k);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i< arr.length; i++)
            arr[i] = list.get(i);
        
        return arr;
        
        // solution 2
        // sort both array
        // if nums1[i] == nums2[j], add nums1[i] into list, i++, j++
        // else if nums1[i] < nums2[j], i++
        // else j++
    }
}
