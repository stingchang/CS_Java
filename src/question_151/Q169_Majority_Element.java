package question_151;

public class Q169_Majority_Element {
    public int majorityElement(int[] nums) {
        
        int occr = 0;
        int n = 0;
        for(int i : nums){
            if(occr == 0){
                n = i;
                occr = 1;
            } else {
                if(i == n) {
                    occr++;
                } else {
                    occr--;  
                }
            }
        }
        return n;
    }
}
