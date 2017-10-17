package question_001;

import java.util.ArrayList;
import java.util.List;

public class Q046_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            System.out.println("Add: "+tempList);
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                System.out.println("Add: "+nums[i]+", bk : "+tempList+", remove "+tempList.get(tempList.size() - 1));
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Q046_Permutations q = new Q046_Permutations();

        int[] arr = {1,2,3};
        q.permute(arr);
        System.out.println();
    }
}
