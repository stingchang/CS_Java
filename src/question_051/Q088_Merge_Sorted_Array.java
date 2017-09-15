package question_051;

public class Q088_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = m + n + 1; i >= 0; i--) {
            if (m < 0) {
                nums1[i] = nums2[n--];
            } else if (n < 0) {
                nums1[i] = nums1[m--];
            } else if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums2[n--];
            }
        }
    }

}
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
The number of elements initialized in nums1 and nums2 are m and n respectively.
* */

