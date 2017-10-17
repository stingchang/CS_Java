package question_301;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Q341_Flatten_Nested_List_Iterator {
    private Deque<Integer> deque;

    public Q341_Flatten_Nested_List_Iterator(List<NestedInteger> nestedList) {
        deque = new ArrayDeque<>();

        flattern(nestedList);

    }
    private void flattern(List<NestedInteger> list){
        for(NestedInteger n: list){
            if(n.isInteger()) deque.addLast(n.getInteger());
            else flattern(n.getList());
        }
    }

    public Integer next() {
        return deque.removeFirst();
    }

    public boolean hasNext() {
        return deque.size()>0;
    }
}
