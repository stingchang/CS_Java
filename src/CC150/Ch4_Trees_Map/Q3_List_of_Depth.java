package CC150.Ch4_Trees_Map;

import java.util.ArrayList;
import java.util.List;

public class Q3_List_of_Depth {
    public List<List<Node>> listOfDepth(Node node) {
        List<Node> list = new ArrayList<>();
        list.add(node);
        List<List<Node>> lists = new ArrayList<>();


        while (!list.isEmpty()) {
            List<Node> cur = new ArrayList<>(list);
            lists.add(cur);

            List<Node> next = new ArrayList<>();
            for (Node n : cur) {
                if (n.left != null) next.add(n.left);
                if (n.right != null) next.add(n.right);
            }
            list = next;
//            list.clear();
//            list.addAll(next);
        }
        return lists;
    }

    public static void main(String[] args) {
        Q2_Minimal_Tree q2 = new Q2_Minimal_Tree();
        Q3_List_of_Depth q3 = new Q3_List_of_Depth();
        Node root = q2.construct(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        //q2.bfs(root);
        List<List<Node>> lists = q3.listOfDepth(root);
        for (List<Node> list : lists) {
            for (Node n : list) {
                System.out.print(n.value + " ");
            }
            System.out.println();
        }
    }
}
