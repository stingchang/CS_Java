package question_001;

import java.util.*;

public class Q015_3SUM {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        int len = nums.length;
        for(int i=0; i<len-2; i++){


            int head = i+1, tail = len-1, target = nums[i] * -1;
            //  System.out.println("i: "+i+" , head = "+ head+", tail = " +tail);
            while(head<tail){
                if(nums[head]+nums[tail]==target){
                    // System.out.println("Found: "+nums[i]+" "+ nums[head]+" " +nums[tail]);
                    set.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[head], nums[tail])));
                    while(head < tail && nums[head] == nums[head+1]){ head++; }
                    head++;
                    while(head < tail && nums[tail] == nums[tail-1]){ tail--; }
                    tail--;
                } else if(nums[head]+nums[tail]<target){
                    head++;
                } else {
                    tail--;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
