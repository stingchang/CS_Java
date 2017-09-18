package CC150.Ch3_Stacks_Queues;

public class Stack {

    private Node head;

    public Stack() {
        head = new Node(0);
    }

    public void push(int val) {
        Node n = new Node(val);
        n.setNext(head.getNext());
        head.setNext(n);
    }

    public int peek() {
        return head.getNext().getValue();
    }

    public int pop() throws NullPointerException {
        int val = head.getNext().getValue();
        head = head.getNext();
        return val;
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }
}
