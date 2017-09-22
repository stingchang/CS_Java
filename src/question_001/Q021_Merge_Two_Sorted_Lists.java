package question_001;

public class Q021_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null ) return l2;
        if(l2 == null ) return l1;
        ListNode h = new ListNode(0);
        h.next = merge(l1, l2);
        return h.next;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next = merge(l1.next, l2);
            return l1;
        }
        else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
/*
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode newList = new ListNode(Math.min(l1.val, l2.val));
        if(newList.val == l1.val)
            l1 = l1.next;
        else
            l2 = l2.next;


        ListNode tmp = newList;

        while(l1!=null && l2!=null){
            if(l1.val > l2.val) {
                tmp.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            else {
                tmp.next = new ListNode(l1.val);
                l1 = l1.next;
            }

            tmp = tmp.next;
        }

        if(l1 != null) tmp.next = l1;
        if(l2 != null) tmp.next = l2;

        return newList;
    }
 */