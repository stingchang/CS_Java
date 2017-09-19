package DataStructure.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {


    public static void  main(String[] args){
        LinkedHashSet<Integer> set  = new LinkedHashSet<>();
        set.add(3);

        set.add(2);

        set.add(6);
        set.add(9);

        set.add(1);
        System.out.println(set);

    }
}
