package CC150.Ch2_LinkedList;

public class Q7_Palindrome {
    public boolean isPalindDrome(Node n){
        Node t = reverseClose(n);

        return isSame(n, t);
    }
    public Node reverseClose(Node n){
        Node head = new Node(0);

        Node runner = n;

        while(runner!=null){
            Node tmp = new Node(runner.val);
            tmp.next = head.next;
            head.next = tmp;
            runner = runner.next;
        }

        return head.next;
    }
    public boolean isSame(Node n1, Node n2){
        Node temp1 = n1, temp2 = n2;
        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1==null && temp2==null;
    }


    public static void main(String[] args){
        Q7_Palindrome q = new Q7_Palindrome();

        Node n = new Node(0);
        n.addTail(1);
        n.addTail(2);
        n.addTail(3);
        n.addTail(2);
        n.print();
        boolean result = q.isPalindDrome(n);
        System.out.println(result);


        n.addTail(1);
        n.addTail(0);

        result = q.isPalindDrome(n);
        n.print();
        System.out.println(result);
    }
}
