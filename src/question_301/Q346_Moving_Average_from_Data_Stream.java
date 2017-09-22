package question_301;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q346_Moving_Average_from_Data_Stream {
    private Deque<Integer> queue;
    private int size;
    private int total;

    public Q346_Moving_Average_from_Data_Stream(int size) {
        queue = new ArrayDeque<>();
        this.size = size;
        this.total = 0;
    }

    public int next(int value) {
        queue.addLast(value);
        total += value;

        if (queue.size() > size) {
            total -= queue.removeFirst();
        }

        return total / size;
    }
}
