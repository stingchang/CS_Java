package question_201;

import java.util.Stack;

public class Q224_Basic_Calculator {
    public int calculate(String s) {
        if(s==null || s.length() == 0) return 0;

        s = s.replaceAll(" ", "");

        int sign = 1, result = 0, index = 0;
        Stack<Integer> stack = new Stack<>();
        while(index<=s.length()-1){
            char c = s.charAt(index);
            switch(c){
                case '+':
                    sign = 1;
                    index++;
                    break;
                case '-':
                    sign = -1;
                    index++;
                    break;
                case '(':
                    stack.push(result);
                    stack.push(sign);
                    index++;
                    sign = 1;
                    result = 0;
                    break;
                case ')':
                    result = result*stack.pop()+stack.pop(); // curNum*sign + preNum
                    index++;
                    break;
                default:
                    int end = index;
                    while(end<=s.length()-1 && Character.isDigit(s.charAt(end))) end++;
                    // System.out.println(index+" to "+end+" "+Character.isDigit(end)+" "+(end<=s.length()-1));
                    int nextNum = Integer.parseInt(s.substring(index, end));

                    result += nextNum*sign;
                    //System.out.println("next num = "+nextNum);
                    index = end;
                    break;
            }
        }
        return result;
    }
}

/*
int result = 0, sign =1;// sign can be 1 or -1
- : sign = -1
+ : sign = 1
d : result += nextNum*sign // 12-345, result = 12, nextNum = 345
( : push result, push sign, initialize sige and result
) : result = pop*pop*result
*/