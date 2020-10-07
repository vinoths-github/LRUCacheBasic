package org.vinoth;

import org.vinoth.impl.LRUImpl;

public class LRUMain {
    public static void main(String args[]
    ) {
        LRUImpl lru = new LRUImpl();
        lru.add(1);
        lru.add(3);
        lru.add(5);
        lru.add(7);
        lru.printQueue();
        System.out.println();
        lru.update(5, 10);
        lru.printQueue();
    }
}
