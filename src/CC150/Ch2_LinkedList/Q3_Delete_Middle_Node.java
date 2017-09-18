package CC150.Ch2_LinkedList;

public class Q3_Delete_Middle_Node {
    public void deleteMiddle(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
