package question_151;

public class Q167_Two_Sum_II_Input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0, b = numbers.length-1;
        
        int sum = numbers[a]+numbers[b];
        while( sum != target && a<b ){
            
            if (numbers[a]+numbers[b] < target){
                a++;
            } else {
                b--;
            }
            sum = numbers[a]+numbers[b];
        }
        int[] ans = {a+1, b+1};
        return ans;
    }
}
