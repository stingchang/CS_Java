package question_001;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q032_Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {
        if(s == null || s.length()<=1) return 0;

        Deque<Integer> stack  = new ArrayDeque<>();
        stack.addLast(-1); // convenient to calculate from beginning to first invalid index

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.addLast(i);
            } else {
                if(stack.size()>1 && s.charAt(stack.getLast()) == '(') stack.removeLast();
                else stack.addLast(i);
            }
        }
        stack.addLast(s.length()); // convenient to calculate from last invalid index to end of string
        // System.out.println(stack);
        int max = 0, second = stack.removeLast();
        while(!stack.isEmpty()){
            int first = stack.removeLast();
            max = Math.max(max, second-first-1);
            second=first;
        }
        return max;
    }
}

/*
use a stack
if cur = '(' put index into stack
if cur = ')' and char at top() = '(', then poll otherwise put index into stack

calculate size between each 2 index n stack
optimize: put -1 at beginning and s.length at the end
size = poll() - poll() -1


*/