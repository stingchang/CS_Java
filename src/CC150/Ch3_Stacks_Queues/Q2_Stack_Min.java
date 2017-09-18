package CC150.Ch3_Stacks_Queues;

import java.util.*;
import java.util.Stack;

public class Q2_Stack_Min extends Stack<Integer>{

    private List<Map.Entry<Integer, Integer>> minList = new ArrayList<>();


    public void push(int value) {
        this.push(value);
        Map.Entry<Integer, Integer> entry = minList.get(minList.size()-1);

        if(value>=entry.getValue()){
            entry.setValue(entry.getValue()+1);
        } else {
            minList.add(new AbstractMap.SimpleEntry<>(value, 1));
        }
    }

    public int getMin() {
        return minList.get(minList.size()-1).getValue();
    }

    public static void main(String[] args){
        Q2_Stack_Min q = new Q2_Stack_Min();

        q.push(7);
        q.push(4);
        q.push(6);
        q.push(2);
        q.push(3);
        q.push(2);
        System.out.println("Min: " +q.getMin());
    }
}
