package question_151;

public class Q160_Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // find 2 lengths of the listnodes, iterate longer one with (a-b) steps, check if has same node
        int l1 = 0, l2 = 0;
        if (headA == null || headB == null)
            return null;

        ListNode a = headA, b = headB;
        while (headA != null) {
            l1++;
            headA = headA.next;
        }
        while (headB != null) {
            l2++;
            headB = headB.next;
        }
        headA = l1 >= l2 ? a : b;
        headB = l1 < l2 ? a : b;
        System.out.println("l1 = " + l1 + ", l2 = " + l2);
        // now headA is longer than headB by (l1-l2)
        for (int i = 0; i < Math.abs(l1 - l2); i++) {
            headA = headA.next;
        }


        while (headA != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
