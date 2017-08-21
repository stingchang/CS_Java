package DataStructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {

    static class Com implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 3, 4, 7, 6, 9, 8};
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        Com c = new Com();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(arr.length, c);
        for (int i : arr) {
            pq2.add(i);
            pq1.add(i);
        }

        System.out.println(Arrays.toString(pq1.toArray()));
        System.out.println(Arrays.toString(pq2.toArray()));
pq1.remove();
        System.out.println(Arrays.toString(pq1.toArray()));
    }
}
