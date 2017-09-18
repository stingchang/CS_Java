package CC150.Ch2_LinkedList;

public class Q4_Partition {
    public Node partition(Node head, int value) {
        if (head == null || head.next == null) return head;

        Node tmp = head;

        //
        Node big = head, small = big;
        while (small != null && big != null) {
            while (big != null && big.val <= value) big = big.next;

            if (big != null) {
                small = big.next;
                while (small != null && small.val > value) small = small.next;
            }
            if (small != null) {
                small.val += big.val;
                big.val = small.val - big.val;
                small.val -= big.val;
            }
            big = small.next;
            small = small.next;
        }

        return head;
    }
}
