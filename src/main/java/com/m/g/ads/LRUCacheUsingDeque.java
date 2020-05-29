package com.m.g.ads;


import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The LRU caching scheme is to remove the least recently used frame when
 * the cache is full and a new page is referenced which is not there in cache.
 * <p>
 * We use two data structures to implement an LRU Cache.
 * <p>
 * Queue:
 * =====
 * Queue which is implemented using a doubly linked list.
 * The maximum size of the queue will be equal to the total number of frames available (cache size).
 * The most recently used pages will be near front end and least recently pages will be near the rear end.
 * <p>
 * Hash:
 * =====
 * A Hash with page number as key and address of the corresponding queue node as value.
 * <p>
 * How it goes?
 * ============
 * When a page is referenced, the required page may be in the memory.
 * If it is in the memory, we need to detach the node of the list and bring it to the front of the queue.
 * <p>
 * If the required page is not in memory, we bring that in memory.
 * In simple words, we add a new node to the front of the queue and update the corresponding node address in the hash.
 * <p>
 * If the queue is full, i.e. all the frames are full, we remove a node from the rear of the queue,
 * and add the new node to the front of the queue.
 */
public class LRUCacheUsingDeque {

    // store keys of cache
    static Deque<Integer> deque;

    // store references of key in cache
    static HashSet<Integer> map;

    // maximum capacity of cache
    static int csize;

    public LRUCacheUsingDeque(int n) {
        deque = new LinkedList<>();
        map = new HashSet<>();
        csize = n;
    }


    /* Refers key x with in the LRU cache */
    public void refer(int value) {
        if (!map.contains(value)) {
            if (deque.size() == csize) {
                //removeLast(): Removes the element at the tail.
                int last = deque.removeLast();
                map.remove(last);
            }
        } else {
            int index = 0, counter = 0;
            Iterator<Integer> itr = deque.iterator();
            while (itr.hasNext()) {
                if (itr.next() == value) {
                    index = counter;
                    break;
                }
                counter++;
            }
            deque.remove(index);
        }

        //push(element): Adds an element to the head.
        deque.push(value);
        map.add(value);
    }

    // display contents of cache
    public void display()
    {
        Iterator<Integer> itr = deque.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args)
    {
        LRUCacheUsingDeque lruCacheUsingDeque = new LRUCacheUsingDeque(4);
        lruCacheUsingDeque.refer(1);
        lruCacheUsingDeque.refer(2);
        lruCacheUsingDeque.refer(3);
        lruCacheUsingDeque.refer(1);
        lruCacheUsingDeque.refer(4);
        lruCacheUsingDeque.refer(5);
        lruCacheUsingDeque.display();
    }
}

