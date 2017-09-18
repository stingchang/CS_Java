package CC150.Ch4_Trees_Map;

import java.util.ArrayList;
import java.util.List;

public class Q12_Paths_with_Sum {
    public List<List<Node>> pathSum(int target, Node node) {
        List<List<Node>> lists = new ArrayList<>();


        build(target, 0, node, lists, new ArrayList<>());
        return lists;
    }

    public void build(int target, int sum, Node node, List<List<Node>> lists, List<Node> list) {
        if (target == sum && list.size() > 0) {
            lists.add(list);
        }
        if (node == null) return;

        // from parent
        List<Node> fromParent = new ArrayList<>(list);
        fromParent.add(node);
        build(target, sum + node.value, node.left, lists, fromParent);
        build(target, sum + node.value, node.right, lists, fromParent);


        // starts from current
        List<Node> fromCur = new ArrayList<>();
        fromCur.add(node);
        build(target, node.value, node.left, lists, fromCur);
        build(target, node.value, node.right, lists, fromCur);

    }

}
/*
for each node there are 2 options
1. starts from current node
2.
 */