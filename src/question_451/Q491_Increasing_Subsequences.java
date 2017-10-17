package question_451;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q491_Increasing_Subsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> lists = new HashSet<>();
        lists.add(list);
        return helper(nums, 0, lists);
    }

    // 2 3 4 4
    public List<List<Integer>> helper(int[] nums, int index, Set<List<Integer>> lists) {
        // base case: don't add current number  [][2]->[][2]
        Set<List<Integer>> tmp = new HashSet<>(lists);

        // add current number [][2]->[3][2,3]
        for (List<Integer> list : lists) {
            if (list.size() == 0 || nums[index] >= list.get(list.size() - 1)) {
                List<Integer> newlist = new ArrayList<>(list);
                newlist.add(nums[index]);
                tmp.add(newlist);
            }
        }

//        System.out.println(index+" : "+tmp);
        if (index < nums.length - 1) return helper(nums, index + 1, tmp);
            // remove all size<2 lists
        else {
            lists.clear();
            for (List<Integer> list : tmp)
                if (list.size() > 1) lists.add(list);
            return new ArrayList<>(lists);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 1};
        Q491_Increasing_Subsequences q = new Q491_Increasing_Subsequences();
        List<List<Integer>> tmp = q.findSubsequences(arr);
        System.out.println(tmp);
    }
}
