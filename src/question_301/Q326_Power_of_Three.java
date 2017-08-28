package question_301;

public class Q326_Power_of_Three {
    public boolean isPowerOfThree(int n) {
        int pow = 0;

        while(n>=Math.pow(3, pow)){

            if(n == Math.pow(3, pow)) {

                return true;
            }
            pow++;
        }
        return false;
    }
}
/*
https://leetcode.com/problems/power-of-three/discuss/
convert to string of base three integer and use regex
return Integer.toString(n, 3).matches("10*");

*/