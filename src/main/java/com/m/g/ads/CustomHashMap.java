package com.m.g.ads;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

public class CustomHashMap<K,V> {

    /**
     * container which stores the data of key value pair...
     */
    private Entry<K, V>[] buckets;

    private int bucketSize = 0;

    private int totalElements;


    /**
     * Default constructor which initializes the number of buckets...
     */
    public CustomHashMap()
    {
        this.buckets = new Entry[16];
        this.bucketSize=16;
    }

    public CustomHashMap(int size)
    {
        if(size<0)
        {
            throw new RuntimeException("Invalid Size");
        }
        this.buckets = new Entry[size];
        this.bucketSize = size;
    }


    /**
     * Inserting Element
     * To insert an element, a key and value, we do the following:
     *
     * First, compute the key's hash code, which will usually be an int.
     * The two different objects could have the same hash code,
     * as there may be an infinite number of elements and a finite number of ints.
     *
     * Then, calculate the index in the array using hash code using modulo as hashCode (key) % array_length.
     * Here, two different hash codes could map to the same index.
     * As Each index there is a linked list present.
     * Get the linked list at the index calculated above.
     * Store the element in this index.
     * The use of a linked list is important because of collisions:
     * you could have two different keys with the same hash code or
     * two different hash codes that map to the same index.
     */
    public void put(K key, V value) {

        // creating a new entry to place in the bucket...
        Entry<K, V> newEntry = new Entry<>(key, value, null);

        // computing the location i.e. index in the Entry array.
        int bucketIndex = computeHash(key) % this.bucketSize;

        Entry<K, V> currentEntry = buckets[bucketIndex];

        if (currentEntry == null) {
            buckets[bucketIndex] = newEntry;
            totalElements++;
        }
        else
        {
            // validating the next link of the current entry found.
            while (currentEntry.getNext() != null) {

                // if key exists we need to replace it with new value...
                if (currentEntry.getKey().equals(key)) {
                    currentEntry.setValue(value);
                    return;
                }

                // to iterate to the next entry...
                currentEntry = currentEntry.getNext();
            }

            // validating the current element key...
            if (currentEntry.getKey().equals(key)) {
                currentEntry.setValue(value);
            } else {

                // adding the new entry i.e. linking it to current entry...
                currentEntry.setNext(newEntry);
                totalElements++;
            }
        }
    }

    /**
     * The retrieval of the element from hashmap can be done with the following steps:
     *
     * Compute the hash code from the key, and then compute the index from the hash code with modulo operation.
     *
     * Then, get the linked list at index computed above and search through the linked list for the value with this value.
     */
    public V get(K key) {
        Entry<K, V> currentLocation = buckets[computeHash(key) % bucketSize];
        while (currentLocation != null) {
            if (key.equals(currentLocation.getKey())) {
                return currentLocation.getValue();
            }
            currentLocation = currentLocation.getNext();
        }
        return null;
    }


    private int computeHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }


    /**
     * Data Structure to handle the HashMap.
     * Data is stored and retrieved using this datastructure..
     * @param <K>
     * @param <V>
     */

    @Getter
    @Setter
    @EqualsAndHashCode
    class Entry<K, V> {
        final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
