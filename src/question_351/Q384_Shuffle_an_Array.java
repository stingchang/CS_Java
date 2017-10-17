package question_351;

import java.util.Random;

public class Q384_Shuffle_an_Array {
    private int[] ori;
    public Q384_Shuffle_an_Array(int[] nums) {
        ori = new int[nums.length];
        System.arraycopy(nums, 0, ori, 0, nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return ori;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] arr = new int[ori.length];
        System.arraycopy(ori, 0, arr, 0, ori.length);
        // System.out.println(Arrays.toString(arr));

        Random r = new Random();
        for(int i =arr.length; i>1 ; i--){
            int loc = r.nextInt(i);
            // System.out.print(loc+" "+ (i-1)+" ");
            int tmp = arr[loc];

            arr[loc] = arr[i-1];

            arr[i-1] = tmp;
        }
        return arr;
    }
}
