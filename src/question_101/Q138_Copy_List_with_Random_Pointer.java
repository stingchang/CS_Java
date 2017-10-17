package question_101;

import java.util.HashMap;
import java.util.Map;

public class Q138_Copy_List_with_Random_Pointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode tmp = head;
        while(tmp!=null){
            map.put(tmp, new RandomListNode(tmp.label));
            tmp = tmp.next;
        }

        tmp = head;
        while(tmp!=null){
            map.get(tmp).next = map.get(tmp.next);
            map.get(tmp).random = map.get(tmp.random);
            tmp = tmp.next;
        }
        return map.get(head);
    }
}
