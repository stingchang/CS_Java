package question_251;

import java.util.Arrays;
import java.util.Comparator;

public class Q252_Meeting_Room {
    public boolean canAttendMeetings(Interval[] intervals) {
        System.out.println(Arrays.toString(intervals));
        Arrays.sort(intervals,
//          1. comparingInt
                Comparator.comparingInt(o -> o.start)

//         reversed
//          Comparator.<Interval>comparingInt(o -> o.start).reversed()

//          2. lambda
//        (Interval o1, Interval o2)->o1.start-o2.start


//          3. comparator
//        new Comparator<Interval>() {
//            @Override
//            public int compare(Interval o1, Interval o2) {
//                return o1.start-o2.start;
//            }
//        }

        );
        System.out.print(Arrays.toString(intervals));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i].end > intervals[i].start) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Q252_Meeting_Room q = new Q252_Meeting_Room();
        Interval[] ints = {
                new Interval(5, 10),
                new Interval(3, 8),
                new Interval(2, 4),
                new Interval(9, 12),
                new Interval(11, 19)
        };
        q.canAttendMeetings(ints);
    }
}

class Interval {
    int start;
    int end;
    String name;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public String toString() {
        return "(" + start + "," + end + ")";
    }
}
