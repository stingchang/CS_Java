package question_151;

public class Q154_Find_Minimum_in_Rotated_Sorted_Array_II {
    public int findMin(int[] num) {
        int lo = 0;
        int hi = num.length - 1;
        int mid = 0;

        while(lo < hi) {
            mid = lo + (hi - lo) / 2;

            if (num[mid] > num[hi]) {
                lo = mid + 1;
            }
            else if (num[mid] < num[hi]) {
                hi = mid;
            }
            else { // when num[mid] and num[hi] are same
                hi--;
            }
        }
        return num[lo];
    }
}
// 3 cases
// a[i] < a[j] not sorted, min = a[0]
// a[i] < a[mid], pivot at right, i = mid+1
// a[mid] < a[j], pivot at i~mid, j = mid
