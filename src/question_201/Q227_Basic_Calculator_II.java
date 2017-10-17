package question_201;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

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


    /////////   Solutions ///////
    /*
        + : push nextNum
        - : push nextNum*-1
        * : push(pop * nextNum)
        / : push(pop / nextNum)
    */

    public int calculate2(String s) {
        if(s == null || s.length()==0) return 0;
        s = s.replaceAll(" ", "");
        Stack<Integer> stack = new Stack<>();

        // step 1: add a sign at head, then string will be the format of "n pairs of'sign_num'"
        if(Character.isDigit(s.charAt(0))) s = "+" + s;
        // System.out.println(s);

        int index = 0;
        while(index<s.length()){
            char sign = s.charAt(index);

            int end = getEnd(s, index+1);
            int nextNum = Integer.parseInt(s.substring(index+1, end));
            index = end;
            // System.out.println("next num: "+nextNum);
            switch(sign){
                case '+': stack.push(nextNum);
                    break;
                case '-': stack.push(nextNum*-1);
                    break;
                case '*': stack.push(stack.pop() * nextNum);
                    break;
                case '/': stack.push(stack.pop() / nextNum);
                    break;
            }
        }

        int base = stack.pop();
        while(stack.size()>0) base+=stack.pop();
        return base;
    }

    // return index of next non digit location
    public int getEnd(String s, int index){
        while(index<=s.length()-1 && Character.isDigit(s.charAt(index))) index++;
        return index;
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