package question_201;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q227_Basic_Calculator_II {
    public int calculate(String s) {
        if(s==null || s.length()==0) return 0;
        if(s.charAt(0) == '-') s = 0+s;

        // 1. remove all spaces
        s = s.replaceAll("\\s", "");
        // 2. split by +-

        String[] strs = s.split("[+-]");
        String[] signs = s.split("[^+^-]+");
//        System.out.println(Arrays.toString(strs));
//        System.out.println(Arrays.toString(signs));
        int base = calDivisionMultiply(strs[0]);
        for(int i =1; i<strs.length;i++){
            int next = calDivisionMultiply(strs[i]);
            System.out.println("next = "+next);
            base = base + next * (signs[i].equals("-")?-1:1);
        }
        return base;

    }

    public int calDivisionMultiply(String str){
        // 3*5/2,  4
        String[] nums = str.split("\\D");
        String[] sign = str.split("\\d+");
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(sign));
        int result = Integer.parseInt(nums[0]);
        for(int index = 1; index<sign.length; index++){
            if(sign[index].equals("/")) result/= Integer.parseInt(nums[index]);
            else result*= Integer.parseInt(nums[index]);
        }
        return result;
    }

    public static void main(String[] args){
        String test = "1/2";
        Q227_Basic_Calculator_II q = new Q227_Basic_Calculator_II();
        int result = q.calculate(test);
        System.out.println(result);
    }
}
/*
1. remove all spaces
2. split string by +-
    a. add all +- into queue1
    b. add all substrings into queue2
3. base number calculate n is queue1.poll
while(queue1 not empty)
n = n q1.poll cal(q1.poll)
*/