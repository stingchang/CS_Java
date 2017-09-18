package CC150.Ch2_LinkedList;

public class Q2_Return_Kth_to_Last {
    public Node kLast(Node node, int k) {
        Node tmp = node;
        for (int i = 0; i < k; i++) {
            if (tmp != null)
                tmp = tmp.next;
            else break;
        }
        if (tmp == null) return null;
        while (tmp != null) {
            tmp = tmp.next;
            node = node.next;
        }
        return node;
    }
}
