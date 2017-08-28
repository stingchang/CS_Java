package question_001;

import java.util.HashMap;
import java.util.Map;

public class Q002_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        // used to track the head
        ListNode pre = new ListNode(0);
        ListNode indexHolder = pre;
        int carry = 0;
        while(l1!=null || l2!=null) {
            int sum = carry + (l1==null ? 0 : l1.val) + (l2==null ? 0 : l2.val);
            carry = sum / 10;
            pre.next = new ListNode(sum % 10);
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            pre = pre.next;
        }
        pre.next = carry > 0 ? new ListNode(carry) : null;

        return indexHolder.next;
    }
    public static void main(String[] args){
        Map<Character, Integer> map = new HashMap<>();
        map.put('s', 2);
//        map.se
        System.out.println(map);
    }
}
