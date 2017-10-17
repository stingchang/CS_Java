package question_301;

public class Q328_Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        // 1.
        ListNode oddTail = head,
                evenTail = head.next;

        while(evenTail!=null && evenTail.next != null){
            ListNode evenNext = evenTail.next.next;

            evenTail.next.next = oddTail.next;
            oddTail.next = evenTail.next;
            evenTail.next = evenNext;

            oddTail = oddTail.next;
            evenTail = evenTail.next;
        }

        return head;
    }
}
/*
1. keep two indices to tail of odd and tail of even node
2. when evenTail has next, move it to between oddTail and evenHead, move the 2 indices to next

*/