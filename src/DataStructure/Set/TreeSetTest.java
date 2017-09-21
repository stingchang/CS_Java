package DataStructure.Set;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetTest {
    public void test() {

    }

    public static void main(String[] args) {
        TreeSet<Integer> set  = new TreeSet<>();
        for(int i = 0; i< 10; i++){
            Random r = new Random();
            set.add(r.nextInt(30)+1);
        }
        int ceil = set.ceiling(15);



        System.out.println(set);
        // [1, 4, 13, 14, 17, 20, 21, 23, 28]
        System.out.println("ceiling 15: "+set.ceiling(15));
        // ceiling 15: 17
        System.out.println("floor 15: "+set.floor(15));
        // floor 15: 14
        Iterator<Integer> it = set.descendingIterator();
        while(it.hasNext())System.out.print(it.next()+" ");
        // 28 23 21 20 17 14 13 4 1

        System.out.println();
        System.out.println();

        System.out.println("Head set(~15) : "+set.headSet(15, true));
        // Head set(~15) : [3, 4, 11, 15]
        System.out.println("Tail set(15~) : "+set.tailSet(15, true));
        // Tail set(15~) : [15, 19, 21, 25, 28, 30]
        System.out.println("Sub set(10~20) : "+set.subSet(10, true, 20, true));
        // Sub set(10~20) : [11, 15, 19]
    }
}
