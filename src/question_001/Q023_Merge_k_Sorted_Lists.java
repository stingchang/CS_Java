package question_001;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q023_Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists ==null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode n1, ListNode n2){
                return n1.val - n2.val;
            }
        });
        for(ListNode n: lists){
            if(n!=null)
                pq.offer(n);
        }

        ListNode head = new ListNode(0);
        ListNode cur = head;

        while(!pq.isEmpty()){
            ListNode n = pq.poll();
            if(n.next!=null){
                pq.offer(n.next);
            }
            cur.next = n;
            cur = cur.next;
        }
        return head.next;

    }
}
