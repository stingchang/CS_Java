package DataStructure.Set;

import java.util.*;

public class SetTest {

    public void HashSet() {
        Set<Person> s1 = new HashSet<>();

        s1.add(new Person("a", "a", 10));
        s1.add(new Person("c", "c", 15));
        s1.add(new Person("b", "b", 13));
        s1.add(new Person("f", "f", 12));

        for (Person p : s1) {
            System.out.print(p);
        }

        System.out.println("\n\nTreeSet:");
        TreeSet<Person> s2 = new TreeSet<>();
        s2.addAll(s1);
        Iterator<Person> it = s2.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

        System.out.println("\n\nTreeSet with comparator:");

        TreeSet<Person> s3 = new TreeSet<>(new AgeCom());
        s3.addAll(s1);
        it = s3.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println("\n\nTreeSet with comparator, enhanced for loop s3:");
        for(Person p: s3){
            System.out.print(p);
        }

        System.out.println("\n\nLinkedHashSet with comparator s4:");
        Set<Person> s4 = new LinkedHashSet<>();
        s4.addAll(s1);
        it = s4.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }


        System.out.println("\n\nSet to Array:");
        Person[] arr = s3.toArray(new Person[s3.size()]);
        for(Person p: arr){
            System.out.print(p);
        }

        System.out.println("\n\nSet to LinkedList:");
        List<Person> l1 = new LinkedList<>(s1);
        for(Person p: l1){
            System.out.print(p);
        }


        System.out.println("\n\nSet to ArrayList:");
        List<Person> l2 = new ArrayList<>(s3);
        for(Person p: l2){
            System.out.print(p);
        }
    }

    class Person implements Comparable<Person>{
        String fname;
        String lname;
        int age;

        public Person(String fname, String lname, int age) {
            this.age = age;
            this.fname = fname;
            this.lname = lname;
        }

        public String toString() {
            return "[" + fname + " " + lname + " " + age + "]";
        }

        @Override
        public int compareTo(Person p2) {
            if(this.fname.equals(p2.fname)) return 0;
            if(this.lname.equals(p2.lname)) return this.fname.compareTo(p2.fname);
            return this.lname.compareTo(p2.lname);
        }
    }

    class AgeCom implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.age - p2.age;
        }
    }

    public static void main(String[] args) {
        SetTest s = new SetTest();
        s.HashSet();
    }
}
/*
* Set, HashSet
* Set to Array
* Set to LinkedList
* LinkedHashSet
* TreeSet
* HashMap keys to HashSet
* HashMap keys to LinkedHashSet
* */