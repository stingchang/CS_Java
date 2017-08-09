package question_051;

public class Q070_Climbing_Stairs {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int a=1, b=2, stair = 3;
        while(stair<=n){
            int s = a+b;
            a = b;
            b = s;
            stair++;
        }
        return b;
        
    }
}
/*
s1  1
s2  2
s3  s1+s2
s4  s3+s4
*/