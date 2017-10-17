package question_101;

import java.util.Stack;

public class Q155_Min_Stack {
    private Stack<int[]> stack;

    /**
     * initialize your data structure here.
     */
    public Q155_Min_Stack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.size() == 0) stack.push(new int[]{x, x});
        else stack.push(new int[]{x, Math.min(x, stack.peek()[1])});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
