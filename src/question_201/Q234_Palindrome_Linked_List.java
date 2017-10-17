package question_201;

public class Q234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        // 1 count how many nodes
        ListNode runner = head;
        int count = 0;
        while (runner != null) {
            count += 1;
            runner = runner.next;
        }
        if (count <= 1) return true;

        // 2. go to middle and reverse second half
        count = count / 2 + count % 2 - 1; // 1 node before second half
        runner = head;
        while (count > 0) {
            count--;
            runner = runner.next;
        }


        // 2.2 reverse
        ListNode second = reverse(runner.next);

        // 3. compare first half and second half
        while (second != null) {
            if (head.val != second.val) return false;
            second = second.next;
            head = head.next;
        }

        return true;
    }

    public ListNode reverse(ListNode node) {

        ListNode cur = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = cur;
            cur = node;
            node = next;
        }
        return cur;
    }
}
