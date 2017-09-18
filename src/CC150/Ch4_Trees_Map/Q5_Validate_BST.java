package CC150.Ch4_Trees_Map;

public class Q5_Validate_BST {
    public boolean isBST(Node node) {
        if (node == null) return true;

        if (node.left != null && node.left.value > node.value) return false;
        if (node.right != null && node.right.value > node.value) return false;

        return isBST(node.left) && isBST(node.right);
    }
}
