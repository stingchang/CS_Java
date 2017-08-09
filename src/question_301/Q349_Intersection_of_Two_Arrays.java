package question_301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q349_Intersection_of_Two_Arrays {
	 public int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
//	        Set<Integer> set2 = new HashSet<>();
	        for(int i : nums1){
	            set.add(i);
	        }
	        List<Integer> list = new ArrayList<>();
	        for(int i : nums2){
	            if(set.contains(i)){
	                list.add(i);
	                set.remove(i);
	            }
	        }
	        
	        int[] arr = new int[list.size()];
	        for(int i =0; i< list.size(); i++){
	            arr[i] = list.get(i);
	        }
	        // return list.toArray(new Integer[list.size()]);
	        return arr;
	    }
}
