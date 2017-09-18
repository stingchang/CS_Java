package CC150.Ch2_LinkedList;

public class Node {
    int val;
    Node next;

    public Node(int value) {
        this.val = value;
        next = null;
    }

    public void print() {
        Node tmp = this;
        while (tmp != null) {
            System.out.print(tmp.val + (tmp.next == null ? "->null" : "->"));
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void addTail(int n) {
        Node runner = this;
        while (runner.next != null) runner = runner.next;

        runner.next = new Node(n);
    }
}
