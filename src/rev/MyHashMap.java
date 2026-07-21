package rev;

import java.util.LinkedList;

class MyHashMap<K, V> {
    private final int SIZE = 16; // Default bucket size
    private LinkedList<Node<K, V>>[] buckets;

    // Node class for key-value pairs
    static class Node<K, V> {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value; // update value if key already exists
                return;
            }
        }
        buckets[index].add(new Node<>(key, value)); // insert new key-value
    }

    public V get(K key) {
        int index = getIndex(key);
        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null; // not found
    }

    public void remove(K key) {
        int index = getIndex(key);
        buckets[index].removeIf(node -> node.key.equals(key));
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println("Contents of MyHashMap:");
        for (LinkedList<Node<K, V>> bucket : buckets) {
            for (Node<K, V> node : bucket) {
                System.out.println(node.key + " = " + node.value);
            }
        }
    }
}
 