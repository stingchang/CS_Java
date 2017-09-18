package CC150.Ch4_Trees_Map;

import java.util.HashSet;
import java.util.Set;

public class Q4_Check_Balanced {
    public boolean isBalanced(Node node) {
        return depth_max(node) - depth_min(node) <= 1;
    }

    public int depth_min(Node node) {
        if (node == null) return 0;
        return Math.min(depth_min(node.left), depth_min(node.right)) + 1;
    }

    public int depth_max(Node node) {
        if (node == null) return 0;
        return Math.max(depth_max(node.left), depth_max(node.right)) + 1;
    }


    public boolean isBalanced_recursive(Node node) {
        // use bfs, store nodes into a queue
        // find out first level not not complete => node number != double of previous level node number
        // if next next level has node, return false;

        if (node == null) return true;

        // 1. find first level that does not have (2 x previous level size) nodes
        Set<Node> cur = new HashSet<>();

        cur.add(node);
        int level = 0;
        while(cur.size()==Math.pow(2,level)){
            Set<Node> next = new HashSet<>();
            for(Node n: cur){
                if(n.left!=null) next.add(n.left);
                if(n.right!=null) next.add(n.right);
            }
            cur = next;
        }

        if(cur.size() == 0) return true;
        Set<Node> next = new HashSet<>();
        for(Node n: cur){
            if(n.left!=null) next.add(n.left);
            if(n.right!=null) next.add(n.right);
        }
        for(Node n: next){
            if(n.left!=null || n.right!=null) return false;
        }


        return true;
    }
}
