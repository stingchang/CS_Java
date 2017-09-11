package question_101;

import java.util.HashMap;
import java.util.Map;

public class Q146_LRU_Cache {

    private Node head, tail;
    private int capacity;
    private Map<Integer, Node> map;

    public Q146_LRU_Cache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        // 1. not in cache
        if (!map.containsKey(key))
            return -1;

        // 2. in cache
        int val = map.get(key).val;
        remove(key);
        addHead(key, val);
        return val;

    }

    public void put(int key, int value) {
        // 1. key in map
        if (map.containsKey(key)) {
            remove(key);
        }

        addHead(key, value);
    }

    private void remove(int key) {
        Node n = map.get(key);
        n.prev.next = n.next;
        n.next.prev = n.prev;
        map.remove(key);
    }

    private void addHead(int key, int val) {
        System.out.println("add (" + key + "," + val + ")");
        Node n = new Node(key, val);
        n.next = head.next;
        head.next.prev = n;
        head.next = n;
        map.put(key, n);
        System.out.println("size " + map.size() + ", capacity = " + capacity);
        while (map.size() > capacity) {
            removeTail();
        }

    }

    private void removeTail() {
//        int key = tail.prev.key;
        Node last = tail.prev;
        map.remove(last.key);

        last.prev.next = tail;
        tail.prev = last.prev;

//        Node pre = tail.prev.prev;
//        pre.prev.next = tail;
//        pre.prev = pre.prev;
        System.out.println("remove " + last.key + ", tail = (" + tail.prev.key + "," + tail.prev.val + ")");
    }

    public void print() {
        System.out.print("print: ");
        Node tmp = head.next;
        while (tmp != tail) {
            System.out.print("(" + tmp.key + "," + tmp.val + ") ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            prev = next = null;
        }
    }


    public static void main(String[] args) {
        Q146_LRU_Cache cache = new Q146_LRU_Cache(1);
        cache.put(2,1);
        cache.print();
        System.out.println("Expect -1: " + cache.get(2));
//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.put(3, 3);
//        cache.put(4, 4);
//        cache.print();
//        cache.put(5, 5);
//        cache.put(6, 6);
//        cache.put(7, 7);
//        cache.put(8, 8);
//        cache.print();
//
//        System.out.println("Expect -1: " + cache.get(1));
//        cache.print();
//
//        System.out.println("Expect 5: " + cache.get(5));
//        cache.print();
    }
}
/*
get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its
*/