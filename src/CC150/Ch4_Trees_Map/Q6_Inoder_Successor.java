package CC150.Ch4_Trees_Map;

public class Q6_Inoder_Successor {
    public NodeParentLink inorderSuccessor(NodeParentLink node) {
        if (node == null) return null;

        // case 1: if root, return right child's left most child
        if (node.parent == null) {
            NodeParentLink right = node.right;

            while (right.left != null) right = right.left;
            return right;
        }

        // case 2: cur is left child
        if (node == node.parent.left) return node.parent;

        // case 3: cur is right child, go to ancestor who's left child, return parent,
        // or to root, return right(case 1)
        while (node.parent != null &&
                ((node.parent.parent != null && node.parent == node.parent.parent.right) || node.parent.parent == null)) {
            node = node.parent;
        }
        // cur is right most child, return null
        if (node.parent == null) return null;

        NodeParentLink right = node.parent.right;
        while (right.left != null) right = right.left;
        return right;

    }

    class NodeParentLink extends Node {
        NodeParentLink parent;
        NodeParentLink left;
        NodeParentLink right;
        int value;
    }
}

/*
           5
      3         8
    1   4    6    10
   0 2        7  9  11

if root
    return right child's left most child
if cur is right child
    return parent

*/