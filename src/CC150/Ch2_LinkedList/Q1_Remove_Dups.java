package CC150.Ch2_LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Q1_Remove_Dups {
    public Node remove(Node root) {
        Set<Integer> used = new HashSet<>();

        Node tmp = new Node(0);
        tmp.next = root;
        while(tmp.next!=null){
            if(used.contains(tmp.next.val)){
                tmp.next = tmp.next.next;
            } else {
                used.add(tmp.next.val);
                tmp = tmp.next;
            }
        }

        return root;
    }
}
