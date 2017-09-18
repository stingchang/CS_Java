package CC150.Ch2_LinkedList;

public class Q5_Sum_Lists {
    public Node sum(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        int overFlow = 0, sum = 0;
        Node newHead = list1;

        while (list1.next != null || list2.next != null) {
            sum = list1.val + list2.val + overFlow;
            overFlow = sum / 10;
            list1.val = sum % 10;
            if (list1.next == null) list1.next = new Node(0);
            if (list2.next == null) list2.next = new Node(0);
            list1 = list1.next;
            list2 = list2.next;
        }
        sum = list1.val + list2.val + overFlow;
        list1.val = sum % 10;
        list1.next = sum > 10 ? new Node(sum / 10) : null;

        return newHead;

    }

    public int getsum(Node l1, Node l2, int sum) {
        return (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + sum;
    }


    public static void main(String[] args) {
        Q5_Sum_Lists q = new Q5_Sum_Lists();
        Node n1 = new Node(7);
        n1.next = new Node(1);
        n1.next.next = new Node(6);

        Node n2 = new Node(5);
        n2.next = new Node(9);
        n2.next.next = new Node(7);

        n1.print();
        n2.print();
        Node n = q.sum(n1, n2);
        n.print();
    }
}
