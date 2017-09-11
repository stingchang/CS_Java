package question_051;

import java.util.Arrays;
import java.util.Stack;

public class Q071_Simplify_Path {
    public String simplifyPath(String path) {
        String[] pathTokens = path.split("/");

        Stack<String> stack = new Stack<>();
        for (String s : pathTokens) {
            if (s.matches("\\.\\.") && !stack.isEmpty()) {
                 stack.pop();

            } else if (!s.matches("\\.\\.?") && s.length() > 0) {
                stack.push(s);

            }
        }

        String out = "";
        while (!stack.isEmpty()) {

            out = "/" + stack.pop() + out;
        }
        if (out.length() == 0)
            return "/";
        return out;
    }

    public static void main(String[] args) {
        Q071_Simplify_Path q = new Q071_Simplify_Path();
        String input = "/a/./b/../../c/";
        String out = q.simplifyPath(input);
        System.out.print("Ans: " + out);
    }
}

/*
* 1. string split("/")
* use a stack to keep track of each token
* if "." ignore
* if ".." pop if not empty
* if other string, push
*
* */
