package question_551;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q599_Minimum_Index_Sum_of_Two_Lists {
	 public String[] findRestaurant(String[] list1, String[] list2) {
	        // maintain 2 maps, each contains <string, int> that tracks restaurant and priority
	        // iterate through 1 map and see if the restaurant is commonly interested in and update the min sum restaurant
	        Map<String, Integer> map1 = new HashMap<>();
	        Map<String, Integer> map2 = new HashMap<>();
	        for(int i =0; i< list1.length; i++){
	            map1.put(list1[i], i);
	        }
	        for(int i =0; i< list2.length; i++){
	            map2.put(list2[i], i);
	        }
	        
	        int minSum = Integer.MAX_VALUE;
	        List<String> list = new ArrayList<>();
	        for(Map.Entry<String, Integer> entry: map1.entrySet()) {
	            if(map2.containsKey(entry.getKey())){
	                int total = entry.getValue() + map2.get(entry.getKey());
	                if(minSum > total){
	                    list.clear();
	                    list.add(entry.getKey());
	                    minSum = total;
	                } else if(minSum == total){
	                    list.add(entry.getKey());
	                }
	            }
	        }
	        
	        return list.toArray(new String[list.size()]);
	    }
}
