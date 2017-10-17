package question_201;

public class Q203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode tmp = newHead;
        while (tmp.next != null) {
            if (tmp.next.val == val) tmp.next = tmp.next.next;
            else tmp = tmp.next;
        }
        return newHead.next;
    }
}
