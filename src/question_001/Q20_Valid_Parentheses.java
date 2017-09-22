package question_001;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q20_Valid_Parentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.addLast(c);
            else {
                if (!stack.isEmpty() && paired(c, stack.getLast())) stack.removeLast();
                else return false;
            }
        }

        return stack.isEmpty();
    }

    public boolean paired(char c2, char c1) {
        return (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}') || (c1 == '(' && c2 == ')');
    }
}
