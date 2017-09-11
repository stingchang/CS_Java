package question_001;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q022_Generate_Parentheses {

    /*
    * Thought:
    *  base case arr[""]
    *  1. for each position from 0 to length of string in arr, insert either '(' or '()'
    *   1 => (, ()
    *   2 => ((,((,((),()(   ((),((),()(,()(),(()),()() => ((,((),()(,()(),(())
    *   3 => ....
    *
    *  2. complete each string with 2n-string.length of ')'
    * * */

    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<>();

        // 1. run n time of append operation
        set.add("");
        for(int i =1; i<=n; i++){
            Set<String> tmp = new HashSet<>();

            for(String s: set){
                // for each location , insert ( or ()
                for(int index =0; index<=s.length(); index++){
                    String left = s.substring(0, index);
                    String right = s.substring(index, s.length());
                    tmp.add(left + "(" + right);
                    tmp.add(left + "()" + right);
                }
            }

            set.clear();
            set.addAll(tmp);
            System.out.println(i+" : "+set);
        }

        // 2. check each bracket string and complete if it's not fully closed
        Set<String> tmp = new HashSet<>();
        for(String s: set){
            if(s.length()< n*2 ){
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                while(sb.length() < n*2 ){
                    sb.append(")");
                }
                tmp.add(sb.toString());
            } else {
                tmp.add(s);
            }
        }
        System.out.println("Ans : "+tmp);

        return new ArrayList<>(tmp);
    }

    public static void main(String[] args){
        Q022_Generate_Parentheses q = new Q022_Generate_Parentheses();
        q.generateParenthesis(3);
    }
}

/*
() -> ()()  ()(
(  -> () (()

*/