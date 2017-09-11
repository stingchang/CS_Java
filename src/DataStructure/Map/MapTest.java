package DataStructure.Map;

import java.util.*;

public class MapTest {
    public void treeMap() {
        System.out.println("Int key test: ");
        // 1. int
        Map<Integer, Integer> map = new TreeMap<>();

        map.put(3, 3);
        map.put(4, 4);
        map.put(1, 1);
        map.put(2, 2);
        map.put(5, 5);
        map.put(0, 0);

        for (int k : map.keySet()) {
            System.out.print("(" + k + "," + map.get(k) + ")");
        }
        System.out.println("\n\nString key test: ");
        // 1. String
        Map<String, Integer> m2 = new TreeMap<>();
        m2.put("5", 5);
        m2.put("2", 2);
        m2.put("1", 1);
        m2.put("33", 33);
        m2.put("012", 12);
        for (String k : m2.keySet()) {
            System.out.print("(" + k + "," + m2.get(k) + ")");
        }

        System.out.println("\n\nString key with comparator test: ");
        Map<String, Integer> m3 = new TreeMap<>(
//                (a,b)->()

                new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) return 0;
                if (o1.length() < o2.length()) return -1;
                if (o1.length() > o2.length()) return 1;
                return o1.compareTo(o2);
            }
        });
        m3.putAll(m2);
        for (String k : m3.keySet()) {
            System.out.print("(" + k + "," + m3.get(k) + ")");
        }

        // 4. Comparable object
        System.out.println("\n\nComparable Object: ");
        Map<Person, Integer> m4 = new TreeMap<>();
        m4.put(new Person(20, "aaa", "aaa"), 20);
        m4.put(new Person(25, "bb", "bb"), 25);
        m4.put(new Person(30, "abb", "abb"), 30);
        m4.put(new Person(31, "c", "c"), 31);
        for(Person p: m4.keySet()){
            System.out.print(p);
        }

        // 4. Comparable object
        System.out.println("\n\nCompare Object using Comparator: ");
        Map<Person, Integer> m5 = new TreeMap<>(new FirstNameCom());
        m5.putAll(m4);
        for(Person p: m5.keySet()){
            System.out.print(p);
        }
    }

    class Person implements Comparable<Person> {
        int age;
        String fname;
        String lname;

        public Person(int age, String fname, String lname) {
            this.age = age;
            this.fname = fname;
            this.lname = lname;
        }

        @Override
        public int compareTo(Person o) {
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return "(" + fname + "," + lname + "," + age + ")";
        }
    }
    class FirstNameCom implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.fname.compareTo(o2.fname);
        }
    }

    class LastNameCom implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.lname.compareTo(o2.lname);
        }
    }

    public void linkedHashMap(){
        System.out.println("\n\nlinkedHashMap: ");
        LinkedHashMap<String, String> m1 = new LinkedHashMap<>();
        m1.put("b","b");
        m1.put("d","d");
        m1.put("k","k");
        m1.put("c","c");
        for(String s: m1.keySet()){
            System.out.print("("+s+","+m1.get(s)+")");
        }
//        m1.
    }

    public static void main(String[] args) {

        MapTest t = new MapTest();
        t.treeMap();

        t.linkedHashMap();
    }
}

/*
* Conclusion:
* 1. str1.compareTo(str2): sort by alphabetic, if we want it sort by length first, override comparator (if o1.length<o2.length return -1)
*
*
* */
