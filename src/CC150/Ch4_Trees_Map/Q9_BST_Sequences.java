package CC150.Ch4_Trees_Map;

import java.util.ArrayList;
import java.util.List;

public class Q9_BST_Sequences {
    public List<int[]> countVariation(Node root) {
return null;
    }

    public void generateLists(Node node, List<Integer> list, List<List<Integer>> lists) {

        list.add(node.value);
        if (node.left == null && node.right==null){
            lists.add(list);
            return;
        }


        if (node.left != null && node.right!=null){
//            generateLists
        }
    }
}

/*
for each node, its left and right can change order
  2   cac be from   2,1,3 and 2,3,1
 /\
1  3
*/


// below is question for "count how many variations can be generated based on an array"
/*
for each array we divide it into 2 sub group based on position k => 0~k-1 k k+1~len-1
total variation will be variation of variation of (k-1) * variation of (len-1-(k+1))

[a] ->   a
         /\

[ab] ->  a       b
         /\      /\
         b         a
[abc]   a      b      c
        /\     /\    /\
          bc  a  c  ab
use dp to solve this problem
base case:
    f(0): 1
    f(1): 1
    f(n): f(0)*f(n-1) + f(1)*f(n-2)... + f(n-1)*f(0)
*/