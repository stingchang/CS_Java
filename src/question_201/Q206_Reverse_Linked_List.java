package question_201;

public class Q206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        
        return head(head, null);
    }
    private ListNode head(ListNode cur, ListNode pre){
        
        if(cur.next == null){
            cur.next = pre;
            return cur;
        } 
        
        ListNode temp = cur.next;
        cur.next = pre;
        return head(temp, cur);
        
    }
}
