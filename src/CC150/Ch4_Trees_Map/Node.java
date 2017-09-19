package CC150.Ch4_Trees_Map;


public class Node {
    Node left;
    Node right;
    int value;

    public Node() {
        this.left = this.right = null;
    }

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}
