package DataStructure.Graph;

import java.util.HashSet;
import java.util.Set;

public class Node {
    Set<Node> neighbors;
    int value;

    public Node(int value) {
        this.value = value;
        neighbors = new HashSet<>();
    }
}