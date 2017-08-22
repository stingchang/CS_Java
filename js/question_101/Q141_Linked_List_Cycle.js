/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    if(head==null || head.next == false)
        return false;

    // use 2 indecis
    var i1 = head,
        i2 = head;

    while(i1 != null && i2!=null){
        i1 = i1.next;
        if(i2.next == null || i2.next.next == null)
            return false;
        i2 = i2.next.next;

        if(i1 == i2)
            return true;
    }

    return false;
};