package question_151;

public class Q172_Factorial_Trailing_Zeroes {
    public int trailingZeroes(int n) {
        int c = 0;
        while(n>0){
            c+=n/5;
            n/=5;
        }
        return c;
    }
}
