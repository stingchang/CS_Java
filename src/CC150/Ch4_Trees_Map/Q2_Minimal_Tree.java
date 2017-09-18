package CC150.Ch4_Trees_Map;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q2_Minimal_Tree {
    public Node construct(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        int len = arr.length;
        Node root = new Node(arr[len / 2]);

        root.left = helper(arr, 0, len / 2 - 1);
        root.right = helper(arr, len / 2 + 1, len - 1);
        return root;
    }

    public Node helper(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        Node n = new Node(arr[mid]);
        // System.out.println("Insert "+n.value);
        n.left = helper(arr, start, mid - 1);
        n.right = helper(arr, mid + 1, end);
        return n;
    }

    // use queue
    public void bfs(Node node) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(node);
        while (!queue.isEmpty()) {
            Deque<Node> next = new ArrayDeque<>();
            for (Node n : queue) {
                System.out.print(n.value + " ");
                if (n.left != null) next.addLast(n.left);
                if (n.right != null) next.addLast(n.right);
            }
            queue.clear();
            queue.addAll(next);
            System.out.println();
        }

    }


    // use stack
    public void dfs() {
        Deque<Integer> deque = new ArrayDeque<>();
    }

    public static void main(String[] args) {
        Q2_Minimal_Tree q = new Q2_Minimal_Tree();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Node root = q.construct(arr);
        q.bfs(root);

    }
}
