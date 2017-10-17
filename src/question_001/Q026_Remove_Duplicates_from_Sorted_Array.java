package question_001;

public class Q026_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int tail = 0, searchFrom = 1;
        while (searchFrom < len) {
            // find first diff, put in [tail+1],
            // tail  = tail+1, searchFrom = searchFrom+1

            while (searchFrom <= len - 1 && nums[searchFrom] == nums[tail]) {
                searchFrom++;
            }
            if (searchFrom != len) {
                nums[tail + 1] = nums[searchFrom];
                tail++;
            }
            searchFrom++;
        }

        return tail + 1;
    }
}
